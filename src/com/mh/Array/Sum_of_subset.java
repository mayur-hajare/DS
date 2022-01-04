package com.mh.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sum_of_subset {

    public static void Input() {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        int k = 0;


        System.out.print("Enter Size Of Set :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value " + i + " : ");
            int v = sc.nextInt();
            s.add(v);
        }

        System.out.println("Enter The value of K  :");
        k = sc.nextInt();
        /*s.add(5);
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(3);*/


        //int[] arr = s.toArray(new int[]s.size());
        Integer[] a = s.toArray(new Integer[s.size()]);


        for (int i = 0; i < s.size(); i++) {
            for (int j = 1; j < a.length; j++) {


                if (a[i] + a[j] == k) {
                    if (a[i] != a[j]) {
                        System.out.println("Sum of Sunset");
                        System.out.print("( " + a[i] + " , " + a[j] + " )");
                        //System.out.print(a[j]);
                        System.out.println();

                    }

                }
            }

        }
    }

    public static void main(String[] args) {
        Input();
    }
}
