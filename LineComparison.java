package com.DayOne;

import java.util.Scanner;

class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void compareLines(Line line1, Line line2) {
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.println("length of Line1 is: "+ length1);
        System.out.println("length of Line2 is: "+ length2);

        if (length1 == length2) {
            System.out.println("Both lines are of equal length.");
        } else if (length1 > length2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
    }
}

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1 (x1 y1 x2 y2):");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        Line line1 = new Line(x1, y1, x2, y2);

        System.out.println("Enter coordinates for Line 2 (x1 y1 x2 y2):");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        Line line2 = new Line(x1, y1, x2, y2);

        Line.compareLines(line1, line2);

    }
}
