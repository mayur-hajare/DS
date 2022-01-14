package Assignments;

import java.util.Arrays;
import java.util.Scanner;

class Interchange_Number {
    int[] a;

    // InterChange Last And Direst Elements

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter Array Elements : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public void Solution() {
        int temp = a[a.length - 1];
        a[a.length - 1] = a[0];
        a[0] = temp;

    }

    // Find Sum And Average Of Array

    public void Solution1() {
        int sum = 0;
        float avg;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        avg = sum / a.length;
        System.out.println();
        System.out.println("Sum of Elements :" + sum);
        System.out.println("Average of Array :" + avg);
    }
// Find Second-Largest Number

    public void Solution2() {
        Arrays.sort(a);
        System.out.println();
        System.out.println("Second Largest Number in Array :" + a[a.length - 2]);
    }

    public void Display() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }

    }
}

public class First_Assignment {
    public static void main(String[] args) {

        Interchange_Number interchange_number = new Interchange_Number();
        interchange_number.Input();
        interchange_number.Solution();
        interchange_number.Display();
        interchange_number.Solution1();
        interchange_number.Display();
        interchange_number.Solution2();
        interchange_number.Display();

    }
}
