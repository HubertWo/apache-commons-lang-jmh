# StringBuilder benchmark 

Please note that this tests require SNAPSHOT build from: https://github.com/apache/commons-lang/pull/812 \
Snapshot JAR is also available in snapshot directory in this repo.

Please find example run on GitHub actions (Java8):
https://github.com/HubertWo/apache-commons-lang-jmh/runs/4242012768?check_suite_focus=true

### How to run benchmarks?
As described on https://github.com/openjdk/jmh :
```shell
cd  string-builder/
mvn clean verify
java -jar target/benchmarks.jar
```
```shell
...
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.276 s
[INFO] Finished at: 2021-11-17T18:06:43+01:00
[INFO] ------------------------------------------------------------------------
string-builder % java -jar target/benchmarks.jar
# JMH version: 1.33
# VM version: JDK 17, OpenJDK 64-Bit Server VM, 17+35-2724
# VM options: <none>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.hubertwo.acljmh.StringBuilderBenchmark.stringBuilderPrimitiveBoolean
...
```

## Example run 
```shell
# JMH version: 1.33
# VM version: JDK 17, OpenJDK 64-Bit Server VM, 17+35-2724
# VM options: <none>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.hubertwo.acljmh.StringBuilderBenchmark.stringBuilderPrimitiveInt

# Run progress: 0.00% complete, ETA 00:08:20
# Fork: 1 of 5
# Warmup Iteration   1: 31519407.227 ops/s
# Warmup Iteration   2: 30552409.186 ops/s
# Warmup Iteration   3: 31130460.711 ops/s
# Warmup Iteration   4: 31536535.637 ops/s
# Warmup Iteration   5: 31758687.304 ops/s
Iteration   1: 31799560.570 ops/s
Iteration   2: 32459746.339 ops/s
Iteration   3: 32644089.946 ops/s
Iteration   4: 32883163.303 ops/s
Iteration   5: 32922851.555 ops/s

# Run progress: 20.00% complete, ETA 00:06:41
# Fork: 2 of 5
# Warmup Iteration   1: 31706076.627 ops/s
# Warmup Iteration   2: 32338584.051 ops/s
# Warmup Iteration   3: 26577661.564 ops/s
# Warmup Iteration   4: 28613800.889 ops/s
# Warmup Iteration   5: 32765705.864 ops/s
Iteration   1: 32831146.462 ops/s
Iteration   2: 32886665.944 ops/s
Iteration   3: 32847268.690 ops/s
Iteration   4: 32788358.816 ops/s
Iteration   5: 32874513.526 ops/s

# Run progress: 40.00% complete, ETA 00:05:00
# Fork: 3 of 5
# Warmup Iteration   1: 30230362.766 ops/s
# Warmup Iteration   2: 30699267.792 ops/s
# Warmup Iteration   3: 31458122.481 ops/s
# Warmup Iteration   4: 31484572.319 ops/s
# Warmup Iteration   5: 31411496.765 ops/s
Iteration   1: 31513743.502 ops/s
Iteration   2: 31487302.876 ops/s
Iteration   3: 31491256.566 ops/s
Iteration   4: 31490158.064 ops/s
Iteration   5: 31509785.815 ops/s

# Run progress: 60.00% complete, ETA 00:03:20
# Fork: 4 of 5
# Warmup Iteration   1: 30935602.974 ops/s
# Warmup Iteration   2: 31409946.891 ops/s
# Warmup Iteration   3: 32037415.494 ops/s
# Warmup Iteration   4: 31995795.449 ops/s
# Warmup Iteration   5: 29368176.915 ops/s
Iteration   1: 31560019.622 ops/s
Iteration   2: 32054677.198 ops/s
Iteration   3: 31997016.677 ops/s
Iteration   4: 32041083.042 ops/s
Iteration   5: 32010624.573 ops/s

# Run progress: 80.00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 30916298.874 ops/s
# Warmup Iteration   2: 31476456.996 ops/s
# Warmup Iteration   3: 32043966.383 ops/s
# Warmup Iteration   4: 32042613.545 ops/s
# Warmup Iteration   5: 32068322.086 ops/s
Iteration   1: 32040261.369 ops/s
Iteration   2: 31980074.208 ops/s
Iteration   3: 31985885.664 ops/s
Iteration   4: 32020931.030 ops/s
Iteration   5: 31952773.279 ops/s


Result "com.github.hubertwo.acljmh.StringBuilderBenchmark.stringBuilderPrimitiveInt":
  32162918.346 ±(99.9%) 395112.511 ops/s [Average]
  (min, avg, max) = (31487302.876, 32162918.346, 32922851.555), stdev = 527463.898
  CI (99.9%): [31767805.835, 32558030.857] (assumes normal distribution)


# Run complete. Total time: 00:08:21

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                          Mode  Cnt         Score        Error  Units
StringBuilderBenchmark.stringBuilderPrimitiveInt  thrpt   25  32162918.346 ± 395112.511  ops/s
```