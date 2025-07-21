package com.company;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        //question 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();
        System.out.println("Enter the third number : ");
        double c = sc.nextDouble();
        System.out.println("The smallest number is "+smallest(a,b,c));
    }

    private static double smallest(double a, double b, double c) {
        return Math.min(Math.min(a,b),c);
    }
}
