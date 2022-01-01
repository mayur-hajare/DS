package com.mh.Array;

// find duplicate in an array of N+1 Integers
public class Find_duplicate_n_plus_1 {

    public static void find(int[] arr) {

        int[] a = arr;

        for (int n : a) {
            if (n == a.length + 1) {
                System.out.print(n + " ");
            }
        }


    }

    public static void main(String[] args) {

        int[] a = new int[]{5, 2, 3, 5, 6, 8, 3};
        find(a);
    }

}
