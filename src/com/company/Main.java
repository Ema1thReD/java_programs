package com.company;

import java.util.Scanner;

public class Main
{
    static void subMatrix(int[][] arr){
        int row = arr.length-2;
        int col = arr[0].length-2;
        int sum,maxSum=0,subRow=0,subCol=0;
        for(int i=0;i<row;i++) {
            sum = 0;
            for(int j=0;j<col;j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2]
                        +arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(maxSum < sum) {
                    maxSum = sum;
                    subRow = i;
                    subCol = j;
                }
            }
        }
        System.out.println("Maximum sum of sub matrix is");
        for(int i=subRow;i<subRow+3;i++) {
            for(int j=subCol;j<subCol+3;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.print("Input width and height of matrix:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] inputMat = new int[row][col];

        System.out.println("Input Matrix with numbers from 0 to 9");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                inputMat[i][j] = sc.nextInt();
            }
        }
        subMatrix(inputMat);
    }
}
