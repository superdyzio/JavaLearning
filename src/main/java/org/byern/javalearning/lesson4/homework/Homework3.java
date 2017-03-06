package org.byern.javalearning.lesson4.homework;

import java.util.Scanner;

/**
 * Created by ByerN on 26.02.2017.
 */
public class Homework3 {
    public static void main(String[] args) {
        /*
         * Make a method returning array representing Sierpinski carpet
         * and print it's result.
         *
         * boolean[][] createSierpinskiCarpet(int width, int height, int iterationNumber)
         *
         * width/height -> size o the returned array.
         * iterationNumber -> number of Sierpinski carpet iterations
         *
         * Assume that width and height is multiplication of 3
         *
         */

        drawSierpinskiCarpet();
    }

    private static boolean[][] createSierpinskiCarpet(int width, int height, int iterationNumber) {
        boolean[][] sierpinskiCarpet = new boolean[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sierpinskiCarpet[i][j] = fillPixel(i, j);
            }
        }

        return sierpinskiCarpet;
    }

    private static boolean fillPixel(int x, int y) {
        while (x > 0 || y > 0) {
            if (x % 3 == 1 && y % 3 == 1)
                return false;
            x /= 3;
            y /= 3;
        }
        return true;
    }

    private static void drawSierpinskiCarpet() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width and height (will be multiplied by 3): ");
        int width = scanner.nextInt() * 3;
        int height = scanner.nextInt() * 3;

        boolean[][] sierpinskiCarpet = createSierpinskiCarpet(width, height, 0);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(sierpinskiCarpet[i][j] ? "+" : "O");
            }
            System.out.println();
        }
    }
}
