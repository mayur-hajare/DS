package Assignments;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

class BinSol {
    int[] a;
    int size;

    public void BinSearch(int[] array, int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    boolean isSorted(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            return true;
        }


        int f = arr[0];
        for (int i = 1; i < len; i++) {
            if (arr[i] < f) {
                return false;
            }
        }

        return true;
    }


   /* public void sol(int[] arr, int s, int key) {
        a = arr;
        size = s;

        Arrays.sort(arr);

        BinSearch(arr, 0, arr.length, key);


    }*/
}

public class BinSearch {
    public static void main(String[] args) {
        int size = 0;
        int key = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        size = sc.nextInt();
        int x, y;
        int[] a = new int[size];

        //int[] a = new int[n];
        if (size > 0) {

            System.out.println("Enter Array Elements : ");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

           /* for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i]) {
                    b = 1;
                }
            }
            if (b == 1) {

                System.out.println("Enter Shorted Array.");
            }*/
            System.out.println("Enter Key to be search : ");
            key = sc.nextInt();
            BinSol binSol = new BinSol();
            x = a[0];
            y = a[1];

            Arrays.sort(a);
            binSol.BinSearch(a, 0, a.length, key);
        } else {
            System.out.println("Enter Array size Greater than ZERO.");

        }


    }
}


