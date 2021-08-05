package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");

        // constant
        int x1 = 10;
        int x2 = 20;
        int y1 = 30;
        int y2 = 40;

        // computation

        double lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The Length is = " + lengthOfLine);

    }
}
