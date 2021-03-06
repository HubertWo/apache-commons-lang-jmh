# JMH benchmarks for Apache StringUtils.join methods

Benchmarks use stable version of Apache Common Utils and SNAPSHOT that use StringBuilder instead of StringJoiner.

Related PR: https://github.com/apache/commons-lang/pull/812 \
More here: https://issues.apache.org/jira/browse/LANG-1675

## How to run benchmarks?
Instructions are in readme files inside string-builder and string-joiner directories. 

## Results

### StringUtils.join with StringBuilder

Please find full log [here](string-builder/README.md)
```shell
Result "com.github.hubertwo.acljmh.StringBuilderBenchmark.stringBuilderPrimitiveInt":
  32852819.319 ±(99.9%) 266415.050 ops/s [Average]
  (min, avg, max) = (32330436.047, 32852819.319, 33519417.293), stdev = 355656.469
  CI (99.9%): [32586404.269, 33119234.369] (assumes normal distribution)
  
  Benchmark                                          Mode  Cnt         Score        Error  Units
StringBuilderBenchmark.stringBuilderPrimitiveInt  thrpt   25  32852819.319 ± 266415.050  ops/s
```

### StringUtils.join with StringJoiner
Please find full log [here](string-joiner/README.md)
```shell
Result "com.github.hubertwo.acljmh.StringJoinerBenchmark.stringJoinerPrimitiveInt":
  9939007.810 ±(99.9%) 144657.469 ops/s [Average]
  (min, avg, max) = (9368750.544, 9939007.810, 10161440.199), stdev = 193113.582
  CI (99.9%): [9794350.341, 10083665.279] (assumes normal distribution)
  
Benchmark                                        Mode  Cnt        Score        Error  Units
StringJoinerBenchmark.stringJoinerPrimitiveInt  thrpt   25  9939007.810 ± 144657.469  ops/s  
```