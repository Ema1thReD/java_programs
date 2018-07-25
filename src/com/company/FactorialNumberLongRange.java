package com.company;

import java.math.BigInteger;
import java.util.Scanner;

class Factorial{
        int n;
        BigInteger bigInteger=new BigInteger("1");

        public void read()
        {
            System.out.println("Enter factorial number ");
            Scanner scan=new Scanner(System.in);
            n=scan.nextInt();
        }

        public void process() {
            if (n < 0) {
                System.out.println("Enter Positive Number! ");
            }
                for (int i = 1; i < n; i++) {
                    bigInteger=bigInteger.multiply(BigInteger.valueOf(i));
                }
        }
        public void disply()
        {
            System.out.println("the factorial value of"+n+" is "+bigInteger);
        }
    }
public class FactorialNumberLongRange
{
    public static void main(String[] args) {
        Factorial f=new Factorial();
        f.read();
        f.process();
        f.disply();
    }
}
