# StringJoiner benchmark 

This test uses the latest build of Apache Commons - 3.12.0

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
# VM options: <none>
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.hubertwo.acljmh.StringJoinerBenchmark.stringJoinerPrimitiveBoolean
...
```

## Example run
```shell
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.hubertwo.acljmh.StringJoinerBenchmark.stringJoinerPrimitiveInt

# Run progress: 0.00% complete, ETA 00:08:20
# Fork: 1 of 5
# Warmup Iteration   1: 9731696.894 ops/s
# Warmup Iteration   2: 10020482.866 ops/s
# Warmup Iteration   3: 10070186.824 ops/s
# Warmup Iteration   4: 10072687.124 ops/s
# Warmup Iteration   5: 10074495.865 ops/s
Iteration   1: 9727815.600 ops/s
Iteration   2: 9863842.184 ops/s
Iteration   3: 9792228.039 ops/s
Iteration   4: 9960236.838 ops/s
Iteration   5: 10011058.254 ops/s

# Run progress: 20.00% complete, ETA 00:06:43
# Fork: 2 of 5
# Warmup Iteration   1: 9534998.876 ops/s
# Warmup Iteration   2: 10124391.227 ops/s
# Warmup Iteration   3: 10174690.327 ops/s
# Warmup Iteration   4: 10182414.794 ops/s
# Warmup Iteration   5: 10185723.716 ops/s
Iteration   1: 10159335.985 ops/s
Iteration   2: 10124719.812 ops/s
Iteration   3: 10083557.596 ops/s
Iteration   4: 9998021.575 ops/s
Iteration   5: 9587151.167 ops/s

# Run progress: 40.00% complete, ETA 00:05:02
# Fork: 3 of 5
# Warmup Iteration   1: 9340321.793 ops/s
# Warmup Iteration   2: 9471753.799 ops/s
# Warmup Iteration   3: 9746262.922 ops/s
# Warmup Iteration   4: 9880503.512 ops/s
# Warmup Iteration   5: 9722706.352 ops/s
Iteration   1: 9888649.571 ops/s
Iteration   2: 9875185.579 ops/s
Iteration   3: 10000777.518 ops/s
Iteration   4: 9813864.961 ops/s
Iteration   5: 10034046.753 ops/s

# Run progress: 60.00% complete, ETA 00:03:21
# Fork: 4 of 5
# Warmup Iteration   1: 9693961.977 ops/s
# Warmup Iteration   2: 9760960.831 ops/s
# Warmup Iteration   3: 9865768.762 ops/s
# Warmup Iteration   4: 9845998.774 ops/s
# Warmup Iteration   5: 10027155.381 ops/s
Iteration   1: 9902082.950 ops/s
Iteration   2: 9368750.544 ops/s
Iteration   3: 9724793.178 ops/s
Iteration   4: 10011283.448 ops/s
Iteration   5: 9931059.581 ops/s

# Run progress: 80.00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 9775146.999 ops/s
# Warmup Iteration   2: 10080237.609 ops/s
# Warmup Iteration   3: 10163311.432 ops/s
# Warmup Iteration   4: 10080932.904 ops/s
# Warmup Iteration   5: 10135003.758 ops/s
Iteration   1: 10128484.944 ops/s
Iteration   2: 10081914.631 ops/s
Iteration   3: 10107838.160 ops/s
Iteration   4: 10137056.181 ops/s
Iteration   5: 10161440.199 ops/s


Result "com.github.hubertwo.acljmh.StringJoinerBenchmark.stringJoinerPrimitiveInt":
  9939007.810 ±(99.9%) 144657.469 ops/s [Average]
  (min, avg, max) = (9368750.544, 9939007.810, 10161440.199), stdev = 193113.582
  CI (99.9%): [9794350.341, 10083665.279] (assumes normal distribution)


# Run complete. Total time: 00:08:23

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                        Mode  Cnt        Score        Error  Units
StringJoinerBenchmark.stringJoinerPrimitiveInt  thrpt   25  9939007.810 ± 144657.469  ops/s
```