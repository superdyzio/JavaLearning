package org.byern.javalearning.lesson2.homework;

import java.util.Scanner;

/**
 * Created by ByerN on 21.02.2017.
 */
public class Homework1 {
    /*
     * There are two circles.
     *
     * Properties that describes circles are: x, y, r
     * x,y -> circle center coordinates
     * r -> circle radius
     *
     * 1. Read properties x1, y1, r1, x2, y2, r2 from input (Scanner usage)
     * 2. Store it in variables
     * 3a. If circles are colliding with each other (overlapping), print "Collision detected!"
     * 3b. else -> print "Collision not detected!"
     *
     * If the smaller one is in the bigger one it's still collision.
     * Inclusive collision.
     *
     * Advanced:
     * -Read a boolean flag from input that says if collision check is inclusive or exclusive
     *  and use it in collision calculation (true -> inclusive, false -> exclusive)
     *
     * Hint:
     * -Math library can be useful. Check Math.sqrt(variable) documentation for example.
     * -https://en.wikipedia.org/wiki/Pythagorean_theorem
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;
        int r1;
        int x2;
        int y2;
        int r2;

        System.out.println("Provide x, y and r for first circle:");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        r1 = scanner.nextInt();

        System.out.println("Provide x, y and r for second circle:");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        r2 = scanner.nextInt();

        double distanceBetweenCenters = getDistanceBetweenCenters(x1, y1, x2, y2);

        if (distanceBetweenCenters < r1 + r2) {
            System.out.println(
                    checkIfCollisionIsInclusive(distanceBetweenCenters, r1, r2) ?
                            "Inclusive collision detected!" :
                            "Exclusive collision detected!"
            );
        } else {
            System.out.println("Collision not detected.");
        }
    }

    private static double getDistanceBetweenCenters(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    private static boolean checkIfCollisionIsInclusive(double distance, int r1, int r2) {
        return distance + r1 <= r2 || distance + r2 <= r1;
    }
}
