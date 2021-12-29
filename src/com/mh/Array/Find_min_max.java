package com.mh.Array;

import java.util.Scanner;

class a {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];

    //Take Input method for Taking element as inout from use.
    public void Take_Input() {
        System.out.println("Enter 10 Element in Array : ");
        for (int i = 0; i < a.length; i++) {
            this.a[i] = sc.nextInt();
        }

    }

    //Display method for Displaying Array Elements.
    public void Display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Max Method for finding Max element in Array.
    public int Max() {
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    // Min Method for finding Min element in Array.

    public int Min() {
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}


public class Find_min_max {
    public static void main(String[] args) {
        a aa = new a();
        aa.Take_Input();
        aa.Display();
        System.out.println();
        System.out.println(aa.Min() + " Is Minimum Number In Array.");
        System.out.println(aa.Max() + " Is Maximum Number In Array.");


    }
}
