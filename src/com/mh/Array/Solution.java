package com.mh.Array;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
import java.util.Collection;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList a = new ArrayList(n);

        for(int i=0;i<a.size();i++){
            a.set(i, sc.nextInt());
        }
        int i=sc.nextInt();
        int ele=sc.nextInt();
        a.add(i,ele);
        int del=sc.nextInt();
        a.contains(del);
    }
}