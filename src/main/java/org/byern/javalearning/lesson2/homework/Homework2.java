package org.byern.javalearning.lesson2.homework;

import java.util.Scanner;

/**
 * Created by ByerN on 21.02.2017.
 */
public class Homework2 {
    /*
     * There are two rectangles.
     *
     * Properties that describes rectangles are: x, y, w, h
     * x,y -> rectangle left-bottom corner coordinates
     * w -> width
     * h -> height
     *
     *
     * 1. Read properties x1, y1, w1, h1, x2, y2, w2, h2 from input (Scanner usage)
     * 2. Store it in variables
     * 3a. If rectangles are colliding with each other (overlapping), print "Collision detected!"
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
     * -https://en.wikipedia.org/wiki/De_Morgan%27s_laws
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect1;
        Rectangle rect2;

        System.out.println("Provide coordinates of left-bottom corner, width and height for first rectangle:");
        rect1 = new Rectangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Provide coordinates of left-bottom corner, width and height for second rectangle:");
        rect2 = new Rectangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.printf("%b\n", Rectangle.inclusiveCollision(rect1, rect2));
    }

    private static class Rectangle {
        private Point leftBottom;
        private Point leftTop;
        private Point rightBottom;
        private Point rightTop;

        Rectangle(int xLeftBottom, int yLeftBottom, int width, int height) {
            this.leftBottom = new Point(xLeftBottom, yLeftBottom);
            this.leftTop = new Point(xLeftBottom, yLeftBottom + height);
            this.rightBottom = new Point(xLeftBottom + width, yLeftBottom);
            this.rightTop = new Point(xLeftBottom + width, yLeftBottom + height);
        }

        static boolean inclusiveCollision(Rectangle rect1, Rectangle rect2) {
            return rect1.leftBottom.x > rect2.leftBottom.x;
        }
    }

    private static class Point {
        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
