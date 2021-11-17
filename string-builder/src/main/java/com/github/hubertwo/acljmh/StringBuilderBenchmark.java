package com.github.hubertwo.acljmh;

import org.apache.commons.lang3.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;

public class StringBuilderBenchmark {
    private static final int[] INT_ARRAY = new int[]{1, 2, 3, 4};
    private static final long[] LONG_ARRAY = new long[]{1L, 2L, 3L, 4L};
    private static final boolean[] BOOLEAN_ARRAY = new boolean[]{false, true, true, false};
    private static final char DELIMITER = ',';

    @Benchmark
    public String stringBuilderPrimitiveInt() {
        return StringUtils.join(INT_ARRAY, DELIMITER);
    }

    @Benchmark
    public String stringBuilderPrimitiveBoolean() {
        return StringUtils.join(BOOLEAN_ARRAY, DELIMITER);
    }

    @Benchmark
    public String stringBuilderPrimitiveLong() {
        return StringUtils.join(LONG_ARRAY, DELIMITER);
    }
}
