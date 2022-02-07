package Assignments;

import java.util.Scanner;

public class PrintNoInString {
    public static boolean prime(int n){

        int c = 2;
        while(c * c <= n){
            if(n%c == 0){
//                System.out.println("not prime");
                return false;
            }
            c +=1;
        }
//        System.out.println("prime");
        return true;
    }

    public static int reverse(int n){
        int rev = 0;
        while(n > 0){
            int rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }
//        System.out.println(rev);
        return rev;
    }
    public static int countFactors(int n){
        int num = n;
        int sum = 0;
        for (int i = 2; i < n ; i++) { //i*i <= n is optimised
            while(num % i == 0){
                sum ++;
//                System.out.print(i + " ");
                num = num/i;
            }
            if(num == 1){
                return sum;
            }
        }
//        System.out.println(1);
        return 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i].length() - 1;
            if(arr[i].charAt(t) == '0' || arr[i].charAt(t) == '1' ||arr[i].charAt(t) == '2'
                    ||arr[i].charAt(t) == '3' ||arr[i].charAt(t) == '4' ||arr[i].charAt(t) == '5' ||
                    arr[i].charAt(t) == '6' ||arr[i].charAt(t) == '7' ||arr[i].charAt(t) == '8' ||arr[i].charAt(t) == '9' ){
                int p = Integer.parseInt(String.valueOf(arr[i].charAt(t)));
                sum = sum + p;
            }
        }

        if(sum == 0){
            System.out.println(-1);
            return;
        }
        if(sum == 1){
            System.out.println(1);
            return;
        }
        boolean result = prime(sum);
        if(result){
            System.out.println(sum);
            return;
        }
        int rev = reverse(sum);
        result = prime(rev);

        if(result){
            System.out.println(rev);
            return;
        }
        int factors = countFactors(rev);
        System.out.println(factors + 2);

    }
}