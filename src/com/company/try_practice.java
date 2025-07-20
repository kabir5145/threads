package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class try_practice {
    public static void main(String[] args) {
        //question 1
        /*
        try{
            int a = 8;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("This is an error");
        }
         */

        //question 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");

            int a = sc.nextInt();
        if(a%2!=0) {
            try{
                System.out.println("not ok as it is odd.");
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
            else {
                System.out.println("ok");
            }
         */

    }
}
