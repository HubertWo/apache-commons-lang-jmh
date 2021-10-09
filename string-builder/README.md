# StringBuilder benchmark 

Please note that this tests require SNAPSHOT build from:
https://github.com/HubertWo/commons-lang/pull/4


## Example run 
```shell
# Blackhole mode: full + dont-inline hint (default, use -Djmh.blackhole.autoDetect=true to auto-detect)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: com.github.hubertwo.acljmh.StringBuilderBenchmark.stringBuilderPrimitiveInt

# Run progress: 0.00% complete, ETA 00:08:20
# Fork: 1 of 5
# Warmup Iteration   1: 31671009.520 ops/s
# Warmup Iteration   2: 32171511.859 ops/s
# Warmup Iteration   3: 33317078.471 ops/s
# Warmup Iteration   4: 33504922.374 ops/s
# Warmup Iteration   5: 33493301.255 ops/s
Iteration   1: 33329982.016 ops/s
Iteration   2: 33249975.110 ops/s
Iteration   3: 33297643.832 ops/s
Iteration   4: 33519417.293 ops/s
Iteration   5: 33472042.755 ops/s

# Run progress: 20.00% complete, ETA 00:06:43
# Fork: 2 of 5
# Warmup Iteration   1: 31822851.700 ops/s
# Warmup Iteration   2: 32426404.712 ops/s
# Warmup Iteration   3: 32706607.236 ops/s
# Warmup Iteration   4: 32885431.179 ops/s
# Warmup Iteration   5: 33060845.042 ops/s
Iteration   1: 33008749.695 ops/s
Iteration   2: 32988998.255 ops/s
Iteration   3: 33019488.523 ops/s
Iteration   4: 33064538.897 ops/s
Iteration   5: 33031462.776 ops/s

# Run progress: 40.00% complete, ETA 00:05:02
# Fork: 3 of 5
# Warmup Iteration   1: 31538111.401 ops/s
# Warmup Iteration   2: 32007697.671 ops/s
# Warmup Iteration   3: 32518267.864 ops/s
# Warmup Iteration   4: 32532107.784 ops/s
# Warmup Iteration   5: 32546627.015 ops/s
Iteration   1: 32330436.047 ops/s
Iteration   2: 32524023.560 ops/s
Iteration   3: 32396805.916 ops/s
Iteration   4: 32502871.693 ops/s
Iteration   5: 32531951.304 ops/s

# Run progress: 60.00% complete, ETA 00:03:21
# Fork: 4 of 5
# Warmup Iteration   1: 31456668.415 ops/s
# Warmup Iteration   2: 31970871.366 ops/s
# Warmup Iteration   3: 32394065.319 ops/s
# Warmup Iteration   4: 32523510.068 ops/s
# Warmup Iteration   5: 32505776.546 ops/s
Iteration   1: 32511639.833 ops/s
Iteration   2: 32533430.492 ops/s
Iteration   3: 32495139.267 ops/s
Iteration   4: 32504899.698 ops/s
Iteration   5: 32525048.411 ops/s

# Run progress: 80.00% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 31888518.975 ops/s
# Warmup Iteration   2: 32436088.391 ops/s
# Warmup Iteration   3: 32979041.117 ops/s
# Warmup Iteration   4: 32967146.864 ops/s
# Warmup Iteration   5: 32977638.241 ops/s
Iteration   1: 32650002.791 ops/s
Iteration   2: 32981453.136 ops/s
Iteration   3: 32916191.755 ops/s
Iteration   4: 32954541.292 ops/s
Iteration   5: 32979748.636 ops/s


Result "com.github.hubertwo.acljmh.StringBuilderBenchmark.stringBuilderPrimitiveInt":
  32852819.319 ±(99.9%) 266415.050 ops/s [Average]
  (min, avg, max) = (32330436.047, 32852819.319, 33519417.293), stdev = 355656.469
  CI (99.9%): [32586404.269, 33119234.369] (assumes normal distribution)


# Run complete. Total time: 00:08:23

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                          Mode  Cnt         Score        Error  Units
StringBuilderBenchmark.stringBuilderPrimitiveInt  thrpt   25  32852819.319 ± 266415.050  ops/s

Process finished with exit code 0
```