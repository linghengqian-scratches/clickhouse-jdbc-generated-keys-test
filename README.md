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

- Log.

```shell
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the MultiThreadedBuilder implementation with a thread count of 16
[INFO] 
[INFO] -----------< com.lingh:clickhouse-jdbc-generated-keys-test >------------
[INFO] Building clickhouse-jdbc-generated-keys-test 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ clickhouse-jdbc-generated-keys-test ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/clickhouse-jdbc-generated-keys-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ clickhouse-jdbc-generated-keys-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/clickhouse-jdbc-generated-keys-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ clickhouse-jdbc-generated-keys-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ clickhouse-jdbc-generated-keys-test ---
[INFO] Copying 0 resource from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ clickhouse-jdbc-generated-keys-test ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 1 source file with javac [debug target 21] to target/test-classes
[INFO] 
[INFO] --- surefire:3.2.2:test (default-test) @ clickhouse-jdbc-generated-keys-test ---
[INFO] Surefire report directory: /home/linghengqian/TwinklingLiftWorks/git/public/clickhouse-jdbc-generated-keys-test/target/surefire-reports
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.ClickHouseTest
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 5.488 s <<< FAILURE! -- in com.lingh.ClickHouseTest
[ERROR] com.lingh.ClickHouseTest.test -- Time elapsed: 5.467 s <<< FAILURE!
org.opentest4j.AssertionFailedError: expected: <true> but was: <false>
        at org.junit.jupiter.api.AssertionFailureBuilder.build(AssertionFailureBuilder.java:151)
        at org.junit.jupiter.api.AssertionFailureBuilder.buildAndThrow(AssertionFailureBuilder.java:132)
        at org.junit.jupiter.api.AssertTrue.failNotTrue(AssertTrue.java:63)
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:36)
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:31)
        at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:183)
        at com.lingh.ClickHouseTest.test(ClickHouseTest.java:45)
        at java.base/java.lang.reflect.Method.invoke(Method.java:580)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   ClickHouseTest.test:45 expected: <true> but was: <false>
[INFO] 
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.549 s (Wall Clock)
[INFO] Finished at: 2024-06-10T20:38:48+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.2:test (default-test) on project clickhouse-jdbc-generated-keys-test: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/clickhouse-jdbc-generated-keys-test/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.2:test (default-test) on project clickhouse-jdbc-generated-keys-test: There are test failures.

Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/clickhouse-jdbc-generated-keys-test/target/surefire-reports for the individual test results.
Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:333)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:193)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:180)
    at java.util.concurrent.FutureTask.run (FutureTask.java:317)
    at java.util.concurrent.Executors$RunnableAdapter.call (Executors.java:572)
    at java.util.concurrent.FutureTask.run (FutureTask.java:317)
    at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1144)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:642)
    at java.lang.Thread.run (Thread.java:1583)
Caused by: org.apache.maven.plugin.MojoFailureException: There are test failures.

Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/clickhouse-jdbc-generated-keys-test/target/surefire-reports for the individual test results.
Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
    at org.apache.maven.plugin.surefire.SurefireHelper.throwException (SurefireHelper.java:247)
    at org.apache.maven.plugin.surefire.SurefireHelper.reportExecution (SurefireHelper.java:159)
    at org.apache.maven.plugin.surefire.SurefirePlugin.handleSummary (SurefirePlugin.java:542)
    at org.apache.maven.plugin.surefire.AbstractSurefireMojo.executeAfterPreconditionsChecked (AbstractSurefireMojo.java:1101)
    at org.apache.maven.plugin.surefire.AbstractSurefireMojo.execute (AbstractSurefireMojo.java:905)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:193)
    at org.apache.maven.lifecycle.internal.builder.multithreaded.MultiThreadedBuilder$1.call (MultiThreadedBuilder.java:180)
    at java.util.concurrent.FutureTask.run (FutureTask.java:317)
    at java.util.concurrent.Executors$RunnableAdapter.call (Executors.java:572)
    at java.util.concurrent.FutureTask.run (FutureTask.java:317)
    at java.util.concurrent.ThreadPoolExecutor.runWorker (ThreadPoolExecutor.java:1144)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run (ThreadPoolExecutor.java:642)
    at java.lang.Thread.run (Thread.java:1583)
[ERROR] 
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
