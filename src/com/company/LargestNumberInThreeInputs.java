package com.company;
import java.util.Scanner;
public class LargestNumberInThreeInputs
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();

        if(x>y && x>z){
            System.out.println("First Enterd number is greater then remaining two that is "+x);
        }
        if(y>z && y>x){
            System.out.println("second Enterd number is greater then remaining two that is "+y);
        }
        if(z>x && z>x){
            System.out.println("third Enterd number is greater then remaining two that is "+z);
        }
    }
}
