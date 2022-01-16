package com.mh.Array;

import java.util.Scanner;

class kth {
    int[] a = new int[5];
    int k;
    Scanner sc = new Scanner(System.in);

    public void Input() {
        System.out.println("Enter Kth Element :");
        k = sc.nextInt();
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

    }

    public void Display() {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }

    public void find() {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(a[i] + " Is the Kth Max Element of th Array.");
            }
        }
    }

}


public class Find_Kth_max {
    public static void main(String[] args) {

        kth kth = new kth();
        kth.Input();
        kth.find();
        kth.Display();

    }
}
