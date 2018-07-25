package com.company.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionOfAnElementInArray
{
    public static void main(String[] args) {
        //Scanner n=new Scanner(System.in);
        int[] array={15,7,8,6,8,9,0,5,1};
        //int input=n.nextInt();
        int length=array.length;
        int index=-1;
        for(int i=0;(i<array.length)&&(index==-1);i++){
            if(array[i]==15){
                index=i;
            }
        }
        System.out.println(index);
    }
}