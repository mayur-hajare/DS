package com.mh.Array;


// find Largest sum contiguous Subarray [V. IMP]
//  Kadane's Algorithm
public class Contiguous_Subarray {
    public static void main(String[] arges) {

        int[] a = new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
        int sum = 0, start = 0, end = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > 0) {
                start = i;
                System.out.println("S " + start);
                break;
                //sum = sum + a[i];
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                end = a[i];
                System.out.println("E " + end);
            }

        }

        for (int j = start; j <= end + 1; j++) {
            sum = sum + a[j];
            System.out.println("sum " + sum);


        }
        System.out.println(sum);
    }
}
