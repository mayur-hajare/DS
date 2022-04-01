package Assignments;

import java.util.Scanner;

public class CC {
    public static void ABCheck(String str) {
        // code goes here
        int a = 0, b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                a = i;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(j) == 'b') {
                        b = j;

                    }
                }
            }

        }
        if ((a + 3) == b) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ABCheck(s.nextLine());


    }
}
