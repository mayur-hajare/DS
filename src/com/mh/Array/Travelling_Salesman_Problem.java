package com.mh.Array;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class TSP {
    TSP(int[][] a) {
        int[][] arr = a;

        //System.out.println(arr[1][3]);
       /* for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i]);
                System.out.println(arr[j]);
            }
        }*/


        Set<Integer> min = new HashSet<>();
        //int m = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i][j] != 0) {
                    //min = a[i][j];
                    for (int k = 1; k < a.length; k++) {
                        if (a[i][k] > a[i][j])
                            min = Collections.singleton(arr[i][j]);
                    }

                }
            }

            System.out.println(min);

        }


    }

}


public class Travelling_Salesman_Problem {
    public static void main(String[] args) {
        int[][] a;

        a = new int[][]{{0, 10, 15, 20},
                {5, 0, 9, 10},
                {6, 13, 0, 12},
                {8, 8, 9, 0}};


        TSP tsp = new TSP(a);

    }
}
