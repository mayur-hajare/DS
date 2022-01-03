package com.mh.Array;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Problem {

    public static void Solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of size :");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }

        System.out.println("Enter No Of Flavors That Can Be Used :");
        int k = sc.nextInt();
        int count = 0;
        if (k == 1) {
            for (int i = 0; i < a.length; i++) {
                System.out.print("( " + a[i] + " )    ");

            }
            System.out.println();
            System.out.println("Solution :");
            System.out.println(count + n);
//        Set<Integer> s = new HashSet<Integer>();
//        double rand = Math.random(5);
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    System.out.print("( " + a[i] + "  ");
                    System.out.print(+a[j] + " )   ");
                    count++;
                }
            }

            for (int i = 0; i < a.length; i++) {
                System.out.print("( " + a[i] + " )    ");

            }
            System.out.println();
            System.out.println("Solution :");
            System.out.println(count + n);
        }
        // Output is different everytime this code is executed
        // System.out.println("Random Number:" + rand);


    }
    public static void main(String[] args) {

        Solution();
    }
}
