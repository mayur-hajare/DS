package com.mh.Array;

import java.util.Scanner;
import java.util.stream.IntStream;

class arr {
    int[] a = new int[5];
    Scanner sc = new Scanner(System.in);

    //taking array input from user

    public void Take_input() {

        System.out.print("Enter 5 Elements In Array : ");

        IntStream.range(0, a.length).forEach(i -> a[i] = sc.nextInt());             //for each loop
    }


    // Finding Second Max Number from array using sorting
    public int Second_Max() {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (i == 1)
                    break;
            }
        }
        return a[1];
    }

    // Displaying the Array
    public void Display() {
        for (int j : a) {
            System.out.print(j + " ");
        }
    }
}

public class Find_Second_Max {
    public static void main(String[] args) {

        //Creating object of  class
        arr a = new arr();
        //calling Methods
        a.Take_input();
        System.out.println(a.Second_Max() + " Is 2nd Largest Element In Array.");
        a.Display();


    }
}
