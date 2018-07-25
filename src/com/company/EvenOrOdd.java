package com.company;
import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args) {
	int n;
	System.out.println("Enter the Number");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	if(n%2==0)
        System.out.println("Enterd number is Even Number ");
	else
	    System.out.println("Enterd number is odd Number");
    }
}
