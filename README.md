# clickhouse-jdbc-generated-keys-test

- For https://github.com/apache/shardingsphere/pull/31451 .

- Execute the following command on the Ubuntu 22.04.4 instance with `SDKMAN!` and Docker Engine installed.

```shell
sdk install java 21.0.2-graalce
sdk use java 21.0.2-graalce

git clone git@github.com:linghengqian/clickhouse-jdbc-generated-keys-test.git
cd ./clickhouse-jdbc-generated-keys-test/
./mvnw -T1C -e clean test
```