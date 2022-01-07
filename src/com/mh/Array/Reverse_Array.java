package com.mh.Array;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reverse_Array {


    public static void Input(int[] b) {
        Scanner sc = new Scanner(System.in);
        int[] a = b;
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
    }

    public static void Rev(int[] c) {
        int[] a = c;

        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j >= 0; j--) {
                if (a[i] != a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int n : a) System.out.print(n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        int[] a = new int[n];

        Input(a);
        Rev(a);

    }
}
