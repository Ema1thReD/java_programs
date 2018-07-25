package com.company.arrays;

public class AverageOfArrayElements
{
    public static void main(String args[]){
        int[] array={5,6,8,2,9};
        int sum=0;
        System.out.print("Entered Array Elements are ");
        for (int i:array) {
            System.out.print(" " + i);
            sum = sum + i;
        }
        System.out.println("\nSum of elements "+sum);
        int avg=sum/array.length;
        System.out.println("Array length "+array.length);
        System.out.println("Average "+avg);
    }
}
