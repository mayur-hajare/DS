// Remove Duplicate Number From Array


package com.mh.Array;

import java.util.Scanner;

class Solution1 {
    int[] inArr;
    int Del;
    // int find = 0;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To be deleted : ");
        Del = sc.nextInt();
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        inArr = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < inArr.length; i++) {
            inArr[i] = sc.nextInt();
        }
    }

    public void Find() {
        for (int i = 0; i < inArr.length; i++) {
            if (Del == inArr[i]) {
                //find++;
                for (int j = i; j < inArr.length - 1; j++) {
                    inArr[j] = inArr[j + 1];
                }
                break;
            }
        }
//        if (Del == inArr[inArr.length - 1]) {
//            find++;
//            inArr[inArr.length - 1] = 0;
//        }
    }

    public void Display() {
        for (int i = 0; i < inArr.length - 1; i++) {
            System.out.print(inArr[i] + "    ");
        }
        System.out.println();

    }
}

public class Remove_Element {
    public static void main(String[] args) {

        Solution1 s = new Solution1();
        s.Input();
        s.Display();
        s.Find();
        s.Display();

    }
}
