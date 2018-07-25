package com.company.arrays;

public class RemoveAnElementInArray
{
        public static void main(String[] arguments) {
// internalize the array
            int arg[] = { 5, 6, 8, 9, 10 };
// Delete the Array Element position
            int position = 3;
            System.out.print("An array elements are  ");
// Before Delete Array Output
            for (int n = 0; n < arg.length; n++) {
                System.out.print(" "+arg[n]);
            }
            for (int i = 0; i < arg.length; i++) {
// Delete Function
                if (position == i) {
                    for (int j = i + 1; i < arg.length - 1; j++) {
                        arg[i] = arg[j];
                        i++;
                    }
                }
            }
            System.out.print("\nThe output of Array After Delete");
            for (int i = 0; i < arg.length - 1; i++) {
                System.out.print(" "+arg[i]);
            }
        }
}
