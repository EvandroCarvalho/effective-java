package com.effectivejava.chapter1.item6;

public class Autoboxing {

    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
