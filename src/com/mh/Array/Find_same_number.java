package com.mh.Array;

import java.util.HashSet;
import java.util.Set;

public class Find_same_number {


    public static void main(String[] args) {

        int[] a = new int[]{1, 3, 6, 3, 7, 6, 8, 0, 1};

        Set<Integer> s = new HashSet<>();

        for (int n : a) {
            if (s.add(n) == false) {
                System.out.println(n);
            }
            // System.out.println(n);

        }
    }
}
