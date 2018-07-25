package com.company;
import java.util.Scanner;
public class Addition
{
    public static void main(String[] args) {
        int a,b,sum;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First value :");
        a=scan.nextInt();
        System.out.println("Enter Second value :");
        b=scan.nextInt();

        sum=a+b;
        System.out.println("Sum of enterd two values is\n"+sum);

    }
}
