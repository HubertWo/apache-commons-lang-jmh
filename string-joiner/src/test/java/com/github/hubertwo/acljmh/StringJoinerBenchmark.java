package com.github.hubertwo.acljmh;

import org.openjdk.jmh.annotations.Benchmark;

public class StringJoinerBenchmark {

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public void stringJoinPrimitiveInt() {

    }

}