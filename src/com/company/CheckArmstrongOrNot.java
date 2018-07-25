package com.company;

import java.util.Scanner;

public class CheckArmstrongOrNot
{
    public static void main(String[] args) {
        int n,rem,d,temp=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();

        d=n;
        while (d>0){
            rem=d%10;//153%10=3
            temp=temp+rem*rem*rem;//temp=0+(3*3*3)=27
            d=d/10;//153/10=15
        }
        if(temp==n){
            System.out.println("Enterd number is an armstrong number");
        }
        else{
            System.out.println("Enterd number is not an Armstrong number");
        }
    }
}
