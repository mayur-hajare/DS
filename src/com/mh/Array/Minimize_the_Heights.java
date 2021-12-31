package com.mh.Array;

import java.util.Scanner;
// Minimise the maximum difference between heights [V.IMP]


class Min_Height {
    public void Min(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int a[] = arr;
        int k, n;
        System.out.println("Enter the Value of K :");
        k = sc.nextInt();
//        System.out.println("Enter The No OF Elements :");
//        n = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a.length) {
                a[i] = a[i] - k;
            } else {
                a[i] = a[i] + k;
            }

        }
        for (int no : a) {
            System.out.print(no + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }
//            for (int m = 0; m < a.length; m++)
//                System.out.print(m + " ");
        }
        System.out.println("The Array Largest And Smallest Number Are :  ");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println("The Difference Between The Largest And Smallest Number Are :  ");

        System.out.println(a[0] - a[a.length - 1]);
    }

}


public class Minimize_the_Heights {
    public static void main(String[] args) {

        int[] a = new int[]{3, 9, 12, 16, 20};

        Min_Height m = new Min_Height();
        m.Min(a);


    }
}


/*
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer.
        Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.

        A slight modification of the problem can be found here.


        Example 1:

        Input:
        K = 2, N = 4
        Arr[] = {1, 5, 8, 10}
        Output:
        5
        Explanation:
        The array can be modified as
        {3, 3, 6, 8}. The difference between
        the largest and the smallest is 8-3 = 5.
        Example 2:

        Input:
        K = 3, N = 5
        Arr[] = {3, 9, 12, 16, 20}
        Output:
        11
        Explanation:
        The array can be modified as
        {6, 12, 9, 13, 17}. The difference between
        the largest and the smallest is 17-6 = 11.

        Your Task:
        You don't need to read input or print anything. Your task is to complete the function getMinDiff() which takes the arr[], n and k as input parameters and returns an integer denoting the minimum difference.


        Expected Time Complexity: O(N*logN)
        Expected Auxiliary Space: O(N)
*/
