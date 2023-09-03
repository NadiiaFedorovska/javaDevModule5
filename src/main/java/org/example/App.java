package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {
    static int n;

    public static void main(String[] args) {
        n = 6;

        System.out.println("IterationFibonacci for n = " + n + " is " + Fibonacci.fibonacciIterative(n));

        System.out.println("RecursiveFibonacci for n = " + n + " is " + Fibonacci.fibonacciRecursive(n));

        System.out.println("DynamicFibonacci for n = " + n + " is " + Fibonacci.fibonacciDynamic(n));
    }
}
