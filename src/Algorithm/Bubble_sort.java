
// Bubble Sort, also referred to as comparison sort, is a simple sorting algorithm that repeatedly goes through the list,
// compares adjacent elements and swaps them if they are in the wrong order. This is the simplest algorithm and inefficient at the same time.
// Yet, it is very much necessary to learn about it as it represents the basic foundations of sorting.

package Algorithm;

import java.util.Scanner;

class B_Sort {
    Scanner sc = new Scanner(System.in);
    int[] a;

    public void Find() {

        int flag = 0;
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        System.out.println();
        System.out.println("Sorted Array is :");
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + "     ");

    }

    public void Input(int[] b) {
        a = b;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

    }

    public void Display() {

        System.out.println("Given Array is : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "     ");
        }

    }


}


public class Bubble_sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Array Size :");
        n = sc.nextInt();
        int[] a = new int[n];

        B_Sort sort = new B_Sort();
        sort.Input(a);
        sort.Display();
        sort.Find();


    }


}
