package com.company.arrays;

public class SumOfArrayNumbers
{
    public static void main(String args[]){
        int[] array={1,2,5,3,5,8,5,5};
        int sum=0;
        for(int i:array)
        sum+=i;
        System.out.println("The sum of array is "+sum);
    }
}
