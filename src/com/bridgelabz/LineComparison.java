package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation Program");


        // coordinates of Line1
        int x1 = 10;
        int x2 = 20;
        int y1 = 30;
        int y2 = 40;

        // coordinates of Line2
        int a1 = 4;
        int a2 = 6;
        int b1 = 5;
        int b2 = 7;

        // computation

        Double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lengthOfLine2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        System.out.println("The Length Of Line1 is = " + lengthOfLine1);
        System.out.println("The Length Of Line2 is = " + lengthOfLine2);
        
            // checking of comparison of two lines using compareTo method

        if (lengthOfLine1.compareTo(lengthOfLine2) > 0)
            System.out.println("Line1 is greater than Line2");
        else if (lengthOfLine1.compareTo(lengthOfLine2) < 0)
            System.out.println("Line1 is less than Line2");
        else
            System.out.println("Both lines are equal");


    }
}
