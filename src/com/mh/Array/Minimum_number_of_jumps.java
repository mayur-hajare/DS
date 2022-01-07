package com.mh.Array;

import java.util.Scanner;

class max {
    int[] a;

    max(int[] b) {

        a = b;

    }

    public void find() {
        int count = 0, jump = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println("Zero Occurred");
            } else if (a[i] < count) {
                i = a[i];
                jump++;
            } else {

            }

        }
        System.out.println(jump);
    }
}


public class Minimum_number_of_jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter Size Of Array :");
        //int n = sc.nextInt();
        int[] a = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        max m = new max(a);
        m.find();

    }
}
// 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
