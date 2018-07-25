package com.company.arrays;

import java.util.Scanner;

public class TestSpecificElementInArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] elements={3,5,6,8,1,0,2};
        int input=sc.nextInt();
        boolean active=false;
        for(int i:elements)
            if(input==i){
            active=true;
            break;
            }
        if (active)
            System.out.println(input+" Number found");
        else
            System.out.println(input+" Not Found");
    }
}
