package com.company;

import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args) {
        long fact = 1;
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();

        if(n<0){
            System.out.println("Number should be positive integer");
        }
        else{
            for(long c=1;c<=n;c++) {

                fact = fact * c;
            }
                System.out.println("Factorial Number of " + n + " is " + fact);

        }
    }
}
