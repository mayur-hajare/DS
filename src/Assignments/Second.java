package Assignments;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Sol2 {
    String str;
    int[] a;
    int[] x;
    int[] y;

    public void Input() {
        // Input for Question 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        str = sc.nextLine();

        // Input for Question 2
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Input for Question 3
        System.out.println("Enter Size For Array 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter Size For Array 2 : ");
        int n2 = sc.nextInt();
        x = new int[n1];
        y = new int[n2];

        System.out.println("Enter 1st Array Elements : ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Enter 2nd Array Elements : ");
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }

    }

    public void Find() {

        // Solution for Question 1

        char chr = str.charAt(0);
        System.out.println("Question 1 Output :");

        if (Character.isUpperCase(chr)) {
            System.out.println(("True"));
        } else {
            System.out.println("False");
        }

        // Solution for Question 2

        Set<Integer> s = new HashSet<>();
        System.out.println("Question 2 Output :");

        for (int n : a) {
            if (s.add(n) == false) {
                System.out.println("Duplicate Elements Are : " + n + "  ");
            }
        }
        //System.out.println(s);

        // Solution for Question 3

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i = 0; i < x.length; i++) {
            s1.add(x[i]);
        }
        for (int i = 0; i < a.length - 1; i++) {
            s1.add(y[i]);
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    s1.remove(x[i]);
                    s2.remove(y[j]);
                }
            }
        }
        System.out.println("Question 3 Output :");
        s1.addAll(s2);
        System.out.println(s1);


    }

}

public class Second {
    public static void main(String[] args) {

        Sol2 s = new Sol2();
        s.Input();
        s.Find();
    }
}
