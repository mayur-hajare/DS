package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TCS_CodeVita {


    public static void main(String[] args) throws IOException {
        int n = 0, sum = 0, ans = 0;
        int N[] = new int[n];

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
//        String[] strNums;
//
//        BufferedReader bi = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        strNums = bi.readLine().split(" ");
//        for (int i = 0; i < N.length; i++) {
//            N[i] = Integer.parseInt(strNums[i]);
//        }
//        int max = Integer.parseInt(strNums[0]);
        System.out.println("Enter : ");
        //String s[] = scanner.nextLine().split(" ");
        for (int i = 0; i < N.length; i++) {
            String temp = scanner.nextLine();
            if (temp != " ") {
                N[i] = Integer.parseInt(temp);
            }
        }


//        for (int i = 0; i < strNums.length; i++) {
//            num[i] = Integer.parseInt(strNums[i]);
//        }

//        for (int i = 0; i < n; i++) {
//            N[i] = scanner.nextInt();
//        }
        int max = N[0];

        for (int i = 0; i < N.length; i++) {
            if (N[i] > max) {
                max = N[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (N[i] != max) {
                if (i != 0) {
                    ans = (N[i] * max) - N[i - 1];

                }
            }
        }
        if (sum < ans) {
            System.out.println(ans);
        }

    }


}
