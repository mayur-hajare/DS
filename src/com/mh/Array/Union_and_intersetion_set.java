package com.mh.Array;

import java.util.HashSet;
import java.util.Set;


// Find the Union and Intersection of the two sorted arrays.

class Union {
    public void uni(int arr1[], int arr2[]) {
        int a[] = arr1;
        int b[] = arr2;
        Set<Integer> f;
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        System.out.println("Union : ");
        for (int i = 0; i < a.length; i++)
            s1.add(a[i]);

        for (int i = 0; i < b.length; i++)
            s2.add(i);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    s1.remove(a[i]);
                    s2.remove(b[j]);
                }

            }

        }
        s1.addAll(s2);
        s1.remove(0);
        System.out.print(s1);
        //System.out.print(s2);

    }
}

class Intersection {

    public void inter(int arr1[], int arr2[]) {

        int a[] = arr1;
        int b[] = arr2;
        Set<Integer> s = new HashSet<>();
        System.out.println();
        System.out.println("Intersection : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    s.add(a[i]);
                }
            }

        }
        System.out.print(s);

    }


}

public class Union_and_intersetion_set {
    public static void main(String[] args) {

        int[] a = new int[]{1, 21, 3, 41, 51, 61, 88};
        int[] b = new int[]{1, 2, 3, 4, 88};

        Union u = new Union();
        Intersection i = new Intersection();
        u.uni(a, b);
        i.inter(a, b);

    }
}
