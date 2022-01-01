package com.mh.Array;

import java.util.Scanner;

class Minimum_number_of_jumps {

    public static void minJumps() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        int cout = 1;


        System.out.println("Enter Array Elements :");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        //     i  j j+1
        // {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
        //        i  j
        //           i  j

        // 1, 4, 3, 2, 6, 7
        for (int i = 3; i < a.length - 1; i++) {
            // System.out.print(a[i] + " ");
            //for (int j = i + 1; j < a.length; j++) {
            if (a[i] > a[i + 1]) {

                cout++;

                //   int max = a[j];

                //   }
                // System.out.print(" | " + a[j] + " ");

            }
            if (a[i] == 0 || a[i + 1] == 0) {
                System.out.println("Return -1 if you can't reach the end of the array.");
            }
            /*System.out.print(a[i] + " ");
            //System.out.print(a[j] + " ");
            System.out.print(" | ");*/
        }

        System.out.println(cout + "count");

    }


    public static void main(String[] args) {

        minJumps();
    }
}
