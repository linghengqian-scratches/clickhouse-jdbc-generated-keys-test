package com.lingh;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.testcontainers.clickhouse.ClickHouseContainer;
import org.testcontainers.utility.DockerImageName;

import java.sql.*;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SuppressWarnings({"SqlDialectInspection", "SqlNoDataSourceInspection"})
public class ClickHouseTest {

    @Test
    void test() throws SQLException {
        try (ClickHouseContainer container = new ClickHouseContainer(DockerImageName.parse("clickhouse/clickhouse-server:24.4.1.2088"))) {
            container.withDatabaseName("test_lingh").withExposedPorts(8123).start();
            HikariConfig config = new HikariConfig();
            config.setDriverClassName("com.clickhouse.jdbc.ClickHouseDriver");
            config.setJdbcUrl("jdbc:ch://localhost:" + container.getMappedPort(8123) + "/test_lingh");
            HikariDataSource dataSource = new HikariDataSource(config);
            Awaitility.await().atMost(Duration.ofMinutes(1L)).ignoreExceptions().until(() -> {
                dataSource.getConnection().close();
                return true;
            });
            Connection connection = dataSource.getConnection();
            connection.createStatement().executeUpdate("""
                    create table IF NOT EXISTS t_order(
                        order_id Int64 NOT NULL DEFAULT rand(),
                        order_type Int32,
                        user_id Int32 NOT NULL,
                        address_id Int64 NOT NULL,
                        status String
                    ) engine = MergeTree primary key (order_id) order by(order_id)
                    """);
            PreparedStatement preparedStatement = connection.prepareStatement("""
                    INSERT INTO t_order (order_id, user_id, order_type, address_id, status) VALUES (125232323, 1 , 0, 1, 'INSERT_TEST')
                    """, Statement.NO_GENERATED_KEYS);
            preparedStatement.executeUpdate();
            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                assertFalse(resultSet.next());
            }
            dataSource.close();
        }
    }
}
