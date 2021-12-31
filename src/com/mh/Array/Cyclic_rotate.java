package com.mh.Array;

// Write a program to cyclically rotate an array by one.

class Rotate {
    Rotate(int arr[]) {
        int[] a = arr;                                              //0, 1. 2, 3  4
        int x = a[a.length - 1];        //                   int[] a = new int[]{1, 2, 3, 4, 5};
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }

        a[0] = x;
        for (int n : a)
            System.out.print(n + " ");

    }
}

public class Cyclic_rotate {
    public static void main(String[] args) {

        int[] a = new int[]{95, 96, 97, 98, 99, 100};

        Rotate rotate = new Rotate(a);


    }
}
