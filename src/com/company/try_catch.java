package com.company;
import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {

        //question 2
        /*
        Scanner sc = new Scanner(System.in);
        double a;
        a = sc.nextDouble();
        if(a%2!=0){
            try{
                throw new IllegalArgumentException("This is an odd number");
            }catch (Exception e){
                System.out.println("Error:"+e.getMessage());
            }
        }else {
            System.out.print("Correct:");
            System.out.println("This is an even number");
        }
         */
        //question 1
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int  a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int  b = sc.nextInt();
        try {
            double c = a / b;
            System.out.println("The answer of the given question is = "+c);
        } catch (Exception e) {
            System.out.println("We failed to divide .The reason is :");
            System.out.println(e);
        }
        System.out.println("The program ends here!");
         */

    }
}
