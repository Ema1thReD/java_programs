package com.company;
import java.util.Scanner;
public class CheckEnterdNumberIsPrimeNumberOrNot
{
   public static void main(String args[]) {
       int i,n,count=0;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the number");

       n=scan.nextInt();

        for(i=2;i<n;i++) {

            if (n%i == 0)
            {
                count++;
                break;
            }
        }

            if (count == 0)
            {
                System.out.println(n + "number is a Prime number");
               // break;
            } else
                {
                System.out.println(n + "number is Not a Prime number");

            }
   }
}
