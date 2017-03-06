package org.byern.javalearning.lesson4.homework;

/**
 * Created by ByerN on 26.02.2017.
 */
public class Homework1 {

    public static void main(String[] args) {
        /*
         * Create 2 methods for Fibonacci numbers calculation
         * 1. using recursion
         * 2. using loop
         *
         * calculateFibonacciNumberUsingRecursion(int n)
         * calculateFibonacciNumberUsingLoop(int n)
         *
         * n -> indicates which number to calculate
         *
         * -non-positive numbers can be treated like 0
         */

        int[] values = {0, 1, 3, 5, 10};

        for (int value : values) {
            System.out.println("Recursion: " + calculateFibonacciNumberUsingRecursion(value));
            System.out.println("Loop: " + calculateFibonacciNumberUsingLoop(value));
        }
    }

    private static int calculateFibonacciNumberUsingRecursion(int n) {
        return n <= 1 ? n : calculateFibonacciNumberUsingRecursion(n-1) + calculateFibonacciNumberUsingRecursion(n-2);
    }

    private static int calculateFibonacciNumberUsingLoop(int n) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i < n; i++) {
            int temp = num2 + num1;
            num1 = num2;
            num2 = temp;
        }
        return n <= 1 ? n : num2;
    }
}
