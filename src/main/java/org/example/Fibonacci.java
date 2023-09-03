package org.example;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Integer, Long> memo = new HashMap<>();
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long fib = fibonacciDynamic(n - 1) + fibonacciDynamic(n - 2);
        memo.put(n, fib);
        return fib;
    }
}