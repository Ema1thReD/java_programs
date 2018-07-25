package com.company.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertAnArrayIntoElement
{
    public static void main(String[] args) {
       Integer[] array = new Integer[]{1, 2, 3, 8, 13, 21};
        System.out.println("Original numbers: " +Arrays.toString(array));
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(array));
        list.add(3, 5);
        array = list.toArray(new Integer[list.size()]);
        System.out.println("After insert    : " + Arrays.toString(array));
    }

}
