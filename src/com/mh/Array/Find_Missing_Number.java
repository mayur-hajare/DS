package com.mh.Array;

import java.util.Scanner;

class Find_Number {
    int[] arr;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    public void Find() {

        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        int xor2 = 1;
        for (int i = 2; i < arr.length + 1; i++) {
            xor2 = xor1 ^ arr[i];
        }
        System.out.println(xor1 ^ xor2);


//        int exp = arr.length + 1;
//        System.out.println(exp);
//        int total_Sum = (exp * (exp + 1) / 2);
//
//        int sum = 0;
//        for (int n = 0; n < arr.length; n++) {
//            sum = sum + arr[n];
//        }
//        System.out.println(total_Sum);
//        System.out.println(sum);
//        System.out.println("Missing Number is :" + (total_Sum - sum));

    }

}

public class Find_Missing_Number {
    public static void main(String[] args) {

        Find_Number f = new Find_Number();
        f.Input();
        f.Find();

    }
}
