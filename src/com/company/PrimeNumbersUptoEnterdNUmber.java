package com.company;

import java.util.Scanner;

public class PrimeNumbersUptoEnterdNUmber
{
    public static void  main(String args[])
    {

        System.out.println("Enter the value ");

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=2; i<=n;i++)
        {
            for(int j=2;j<=i;j++) {
                if (j == i)
                {
                    System.out.println(i);
                }

                if (i%j== 0)
                {
                    break;
                }
            }
        }
    }
}
