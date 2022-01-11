/*

Selection sort
is a simple sorting algorithm. This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts,
the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty and the unsorted part is the entire list.
The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array.
This process continues moving unsorted array boundary by one element to the right.
This algorithm is not suitable for large data sets as its average and worst case complexities are of Ο(n2), where n is the number of items.

*/


package Algorithm;

import java.util.Scanner;


class S_sort {
    Scanner sc = new Scanner(System.in);
    int[] a;

    void Find() {
        int min = a[1];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {


                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "     ");
        }
    }

    void Input(int[] b) {

        a = b;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

    }

    void Display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "     ");
        }
    }

}

public class Selection_sort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Size Of Array : ");

        n = sc.nextInt();
        int[] a = new int[n];


        S_sort sort = new S_sort();
        sort.Input(a);
        System.out.println("Given Array Is : ");
        sort.Display();
        System.out.println("Sorted Array IS : ");
        sort.Find();


    }
}
