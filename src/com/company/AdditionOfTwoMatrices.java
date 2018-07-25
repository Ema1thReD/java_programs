package com.company;
import java.util.Scanner;
public class AdditionOfTwoMatrices
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number of rows and columns");
        int m=scan.nextInt();
        int n=scan.nextInt();

        int first[][]=new int[m][n];
        int second[][]=new int[m][n];
        int sum[][]=new int[m][n];

        System.out.println("Enter the elements of first matrix\t");
        for(int c=0;c<m;c++)
            for(int d=0;d<n;d++)
                first[c][d]=scan.nextInt();

        System.out.println("Enter the elements of second matrix\t");
        for(int c=0;c<m;c++)
            for(int d=0;d<n;d++)
                second[c][d]=scan.nextInt();

        for(int c=0;c<m;c++)
            for(int d=0;d<n;d++)
                sum[c][d]=first[c][d]+second[c][d];

        System.out.println("Sum of two matrices ");

        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++)
                System.out.print(sum[c][d]+"\t");
            System.out.println(" ");
        }


    }

}
