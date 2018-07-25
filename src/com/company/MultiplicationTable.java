package com.company;
import java.util.Scanner;
public class MultiplicationTable
{

    public static void main(String args[])
    {
        int n,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value :");
        n=scan.nextInt();
        System.out.println("The multiplication table of "+n+" is");

        for(c=1;c<=10;c++)
        {
            System.out.println(n+" * "+c+" = "+(n*c));
        }
    }
}
