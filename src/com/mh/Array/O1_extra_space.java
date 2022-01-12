package com.mh.Array;

import javax.sound.midi.Soundbank;
import java.awt.event.WindowAdapter;
import java.util.Scanner;

class find {
    find(int b[]) {
        int[] arr = b;
    }
}

public class O1_extra_space {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }


        find find = new find(a);

    }
}
