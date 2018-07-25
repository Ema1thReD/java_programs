package com.company;
import java.util.Scanner;
public class PrimeNumbersRange
{
    public static void main(String args[])
    {
        int start,last,i,j,count=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the starting number");
        start=scan.nextInt();
        System.out.println("Enter the last number");
        last=scan.nextInt();

        for(i=2;i<last;i++)
        {
            for( j=2;j<=i;j++)
            {
                if (j == i)
                    {
                        System.out.println(i);
                    }

                    if (i % j == 0)
                    {
                        break;
                    }
            }
        }
    }
}
