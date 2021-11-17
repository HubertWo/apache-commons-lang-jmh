# StringJoiner benchmark 

This test uses the latest build of Apache Commons - 3.12.0

Please find example run on GitHub actions (Java8):
https://github.com/HubertWo/apache-commons-lang-jmh/runs/4241475267?check_suite_focus=true

### How to run benchmarks?
As described on https://github.com/openjdk/jmh :
```shell
cd  string-joiner/
mvn clean verify
java -jar target/benchmarks.jar
```
```shell
...
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.302 s
[INFO] Finished at: 2021-11-17T18:09:54+01:00
[INFO] ------------------------------------------------------------------------
hubert@mac string-joiner % java -jar target/benchmarks.jar
# JMH version: 1.33
# VM version: JDK 17, OpenJDK 64-Bit Server VM, 17+35-2724
# VM invoker: /Users/hubert/Library/Java/JavaVirtualMachines/openjdk-17/Contents/Home/bin/java
# VM options: <none>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.hubertwo.acljmh.StringJoinerBenchmark.stringJoinerPrimitiveInt

# Run progress: 0.00% complete, ETA 00:08:20
# Fork: 1 of 5
# Warmup Iteration   1: 8738862.099 ops/s
# Warmup Iteration   2: 9529522.546 ops/s
# Warmup Iteration   3: 9950244.953 ops/s
# Warmup Iteration   4: 10190427.541 ops/s
# Warmup Iteration   5: 10188496.832 ops/s
Iteration   1: 9508391.374 ops/s
Iteration   2: 9642513.437 ops/s
Iteration   3: 10081715.103 ops/s
Iteration   4: 10215096.451 ops/s
Iteration   5: 10236270.390 ops/s

# Run progress: 20.00% complete, ETA 00:06:41
# Fork: 2 of 5
# Warmup Iteration   1: 9722395.837 ops/s
# Warmup Iteration   2: 9573935.913 ops/s
# Warmup Iteration   3: 9254548.942 ops/s
# Warmup Iteration   4: 9096879.276 ops/s
# Warmup Iteration   5: 8935739.945 ops/s
Iteration   1: 9178254.634 ops/s
Iteration   2: 9596529.957 ops/s
Iteration   3: 9565533.676 ops/s
Iteration   4: 9842910.625 ops/s
Iteration   5: 9585683.281 ops/s

# Run progress: 40.00% complete, ETA 00:05:00
# Fork: 3 of 5
# Warmup Iteration   1: 9436635.258 ops/s
# Warmup Iteration   2: 9790265.388 ops/s
# Warmup Iteration   3: 9675113.270 ops/s
# Warmup Iteration   4: 9629525.639 ops/s
# Warmup Iteration   5: 9612112.131 ops/s
Iteration   1: 9217760.706 ops/s
Iteration   2: 9271659.200 ops/s
Iteration   3: 9326844.182 ops/s
Iteration   4: 9338457.905 ops/s
Iteration   5: 9643452.059 ops/s

# Run progress: 60.00% complete, ETA 00:03:20
# Fork: 4 of 5
# Warmup Iteration   1: 9668702.217 ops/s
# Warmup Iteration   2: 9451816.824 ops/s
# Warmup Iteration   3: 9566329.929 ops/s
# Warmup Iteration   4: 9692969.416 ops/s
# Warmup Iteration   5: 9810171.890 ops/s
Iteration   1: 9537061.342 ops/s
Iteration   2: 9807546.119 ops/s
Iteration   3: 9878965.358 ops/s
Iteration   4: 9876053.583 ops/s
Iteration   5: 9803040.400 ops/s

# Run progress: 80.00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 9611824.251 ops/s
# Warmup Iteration   2: 9580729.137 ops/s
# Warmup Iteration   3: 9734622.967 ops/s
# Warmup Iteration   4: 9554821.418 ops/s
# Warmup Iteration   5: 9677282.385 ops/s
Iteration   1: 9469849.810 ops/s
Iteration   2: 9678236.934 ops/s
Iteration   3: 9347637.049 ops/s
Iteration   4: 9906268.352 ops/s
Iteration   5: 9842576.207 ops/s


Result "com.github.hubertwo.acljmh.StringJoinerBenchmark.stringJoinerPrimitiveInt":
  9655932.325 ±(99.9%) 219779.843 ops/s [Average]
  (min, avg, max) = (9178254.634, 9655932.325, 10236270.390), stdev = 293399.803
  CI (99.9%): [9436152.482, 9875712.169] (assumes normal distribution)


# Run complete. Total time: 00:08:21

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                        Mode  Cnt        Score        Error  Units
StringJoinerBenchmark.stringJoinerPrimitiveInt  thrpt   25  9655932.325 ± 219779.843  ops/s
```