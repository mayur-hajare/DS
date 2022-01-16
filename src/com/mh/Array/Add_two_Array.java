package com.mh.Array;

import java.util.Scanner;


class sol {
    int[] arr;
    int[] arr1;
    int[] r ;

    public void add(int[] a, int[] b) {

        arr = a;
        arr1 = b;
        int size = arr.length + arr1.length;



        int i = 0;
        for (; i < arr.length; i++) {
            r[i] = arr[i];
        }

        for (int j = 0; j < arr1.length; j++) {

            r[arr.length + i] = arr1[j];
        }

    }

    public void Display() {
        // int[] arr = a;

        for (int n : r) System.out.printf(n + "\t");


    }
}

public class Add_two_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");

        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter 1st Array Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }


        System.out.print("Enter 2nd Array Size : ");

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        sol s = new sol();
        s.add(a, a1);
        s.Display();
        s.Display();

    }
}
