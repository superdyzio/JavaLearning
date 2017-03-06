package org.byern.javalearning.lesson4.homework;

/**
 * Created by ByerN on 26.02.2017.
 */
public class Homework2 {

    public static void main(String[] args) {
        /*
         * Create 2 methods for factorial calculation
         * 1. using recursion
         * 2. using loop
         *
         * calculateFactorialUsingRecursion(int n)
         * calculateFactorialUsingLoop(int n)
         *
         * n -> indicates which number to calculate
         *
         * -non-positive numbers can be treated like 0
         */

        int[] values = {0, 1, 3, 5, 10};

        for (int value : values) {
            System.out.println("Recursion: " + calculateFactorialUsingRecursion(value));
            System.out.println("Loop: " + calculateFactorialUsingLoop(value));
        }
    }

    private static int calculateFactorialUsingRecursion(int n) {
        return n <= 1 ? 1 : n * calculateFactorialUsingRecursion(n-1);
    }

    private static int calculateFactorialUsingLoop(int n) {
        int result = n <= 1 ? 1 : n--;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}
