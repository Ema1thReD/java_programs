package com.company;

import java.util.Scanner;

public class StringReverse
{
    public static void main(String[] args) {
        String original,reverse=" ";
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string to reverse ");
        original=scan.nextLine();

        int length=original.length();
        for(int i=length-1;i>=0;i--)
            reverse = reverse + original.charAt(i);

            System.out.println(reverse);

    }
}
