package com.mh.Array;

import java.util.HashSet;
import java.util.Set;

public class Find_same_number {


    public static void main(String[] args) {

        int[] a = new int[]{1, 3, 6, 3, 7, 6, 8, 0, 1};

        Set<Integer> s = new HashSet<>();

        for (int n : a) {
            if (s.add(n) == false) {
                System.out.println(n);

            }
            // System.out.println(n);

        }
    }
}

//import java.io.BufferedReader;
//       import java.io.InputStreamReader;
//public class Find_same_number {
//   public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int length = str.length();
//        int half = length / 2;
//        for (int i = half; i >= 0; i--)
//        {
//            String prefix = str.substring(0, i);
//            String suffix = str.substring(length - i, length);
//            if (prefix.equals("") || suffix.equals(""))
//            {
//                System.out.println("-1");
//                break;
//            }
//            if (prefix.equals(suffix))
//            {
//                System.out.println(prefix);
//               break;
//            }
//        }
//    }
//}


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.HashSet;
//public class Find_same_number {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        String strArr[] = br.readLine().split(",");
//        int len = strArr.length;
//        HashSet < Integer > hs = new HashSet < > ();
//        for (int i = 0; i < len; i++) {
//            hs.add(Integer.parseInt(strArr[i]));
//        }
//        System.out.println(hs.size() - n);
//    }
//}
