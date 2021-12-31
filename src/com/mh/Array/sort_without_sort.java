package com.mh.Array;

public class sort_without_sort {
    public static void main(String[] args) {

        //Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
        System.out.println("Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo");

        int[] a = new int[]{0, 1, 0, 1, 2, 2, 0, 1, 2, 1};

        System.out.println("Given Array is : ");
        for (int no : a) {
            System.out.print(no);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Shorted Array is : ");
        for (int no : a) {
            System.out.print(no);
        }
    }
}
