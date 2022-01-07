package com.mh.Array;

import java.util.Scanner;

class Input {
    int[][] a;

    Input(int[][] s) {
        a = s;
    }

    public void Taking_Input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

    }

    public void Find() {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i][j] < a[i + 1][j]) {
                    System.out.println(i);
                    System.out.println(j);
                    a[i][j + 1] = a[i + 1][j];
                    System.out.println(a[i + 1][j+1]);
                    System.out.println(a[i][j] + a[i + 1][j]);
                }
            }
        }
    }

}


public class Merge_Intervals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2-D Array Size :");
        int x = sc.nextInt();
        System.out.print("Enter 2-D Array Size :");
        int y = sc.nextInt();

        int[][] a = new int[x][y];

        Input i = new Input(a);
        i.Taking_Input();
        i.Find();

    }
}
