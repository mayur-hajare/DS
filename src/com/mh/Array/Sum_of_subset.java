package com.mh.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sum_of_subset {

    public static void Input(Set set) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = set;

        System.out.print("Enter Size Of Set :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Value " + i + " : ");
            int v = sc.nextInt();
            if (s.contains(v)) {
                System.out.println("Element already in Set..");
                break;
            } else {
                s.add(v);
            }
        }
    }

    public static void Find(Set set) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = set;
        Integer[] a = s.toArray(new Integer[s.size()]);
        System.out.println("Enter The value of K  :");
        int k = sc.nextInt();
        /*s.add(5);
        s.add(2);
        s.add(4);
        s.add(6);
        s.add(3);*/


        //int[] arr = s.toArray(new int[]s.size());


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


    public static void Display(Set set) {
        Set<Integer> s = set;
        Integer[] a = s.toArray(new Integer[s.size()]);
        System.out.println("Set Elements Are :");
        System.out.print("[ ");
        for (int i = 0; i < s.size(); i++) {
            if (i != s.size() - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.print("]");


    }

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        Input(set);
        Find(set);
        Display(set);


    }
}
