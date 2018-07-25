package com.company;

import java.util.Scanner;

public class SwapTwoNumbers
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two values :");

        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("before Swpping the values are");
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        /*By using temp variable
        String c=a;
        a=b;
        b=c;*/
        //without using temp variable
        a=a+b;//3+2=5
        b=a-b;//5-2=3
        a=a-b;//5-3=2


        System.out.println("After Swpping the values are");

        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
}
