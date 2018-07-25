package com.company.arrays;

import java.util.Arrays;

public class SortNumericAndStringArray
{
    public static void main(String args[]){
        int[] array1={1991,1996,1992,1993,1998,1999,1994,1995,1997};
        String[] array2={"AAA","MMM","KKK","DDD","LLL","CCC","RRR","PPP","BBB","GGG"};

        System.out.println("Array Numeric Numbers"+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array"+Arrays.toString(array1));

        System.out.println("Array String names"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String Array"+Arrays.toString(array2));

    }
}
