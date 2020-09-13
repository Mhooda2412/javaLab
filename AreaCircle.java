package com.company;

/*
* Program to compute the area of a circle.
* */

import java.util.Scanner;

public class AreaCircle {

    static double areaCircle(int radius){
        double pi = 3.14;
        return pi*radius*radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int radius = scanner.nextInt();
        double circleArea = areaCircle(radius);
        System.out.println("Area of circle: "+circleArea);
    }

}
