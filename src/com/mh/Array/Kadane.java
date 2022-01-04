package com.mh.Array;

// Kadane's Algo [V.V.V.V.V IMP]
// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

import java.util.Scanner;

class Find {
    int[] s;
    int sum = 0;
    int max = -2147483648;

    Find(int[] a) {
        s = a;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }
    }

    public void Max_Sum() {

        for (int k = 0; k < s.length; k++) {
            if (max < s[k]) {
                max = s[k];
            }
        }
        //System.out.println(max);
        int i = 0, j = i + 1;
        for (; i < s.length - 1; i++) {
            for (; j < s.length; j++) {
                if (j == 1) {
                    sum = sum + s[i] + s[j];
                } else {
                    sum = sum + s[j];
                }
                if (max < sum) {
                    max = sum;
                }
                // System.out.println(max);

            }

        }
//        System.out.println(i);
//        System.out.println(j);
        System.out.println(max);
    }
}

public class Kadane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        Find f = new Find(a);
        f.Input();
        f.Max_Sum();


    }
}
