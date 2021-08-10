package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void getResult(int x1, int x2, int y1, int y2, int a1, int a2, int b1, int b2) {
        // computation

        Double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lengthOfLine2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        System.out.println("\nThe Length Of Line1 is = " + lengthOfLine1);
        System.out.println("The Length Of Line2 is = " + lengthOfLine2);

        // checking of comparison of two lines using compareTo method

        if (lengthOfLine1.compareTo(lengthOfLine2) > 0)
            System.out.println("\nLine1 is greater than Line2");
        else if (lengthOfLine1.compareTo(lengthOfLine2) < 0)
            System.out.println("\nLine1 is less than Line2");
        else
            System.out.println("\nBoth lines are equal");
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        // coordinates of Line1
        System.out.print("Enter x co-ordinates of first point :" + "\nx1 = ");
        int x1 = sc.nextInt();
        System.out.print("Enter x co-ordinates of second point : " + "\nx2 = ");
        int x2 = sc.nextInt();
        System.out.print("Enter y co-ordinates of first point : " + "\ny1 = ");
        int y1 = sc.nextInt();
        System.out.print("Enter y co-ordinates of second point : " + "\ny2 =  ");
        int y2 = sc.nextInt();

        // coordinates of Line2
        System.out.print("Enter a co-ordinates of first point : " + "\na1 = ");
        int a1 = sc.nextInt();
        System.out.print("Enter a co-ordinates of second point : " + "\na2 = ");
        int a2 = sc.nextInt();
        System.out.print("Enter b co-ordinates of first point : " + "\nb1 = ");
        int b1 = sc.nextInt();
        System.out.print("Enter b co-ordinates of second point : " + "\nb2 = ");
        int b2 = sc.nextInt();
        getResult(x1, x2, y1, y2, a1, a2, b1, b2);
    }
}
