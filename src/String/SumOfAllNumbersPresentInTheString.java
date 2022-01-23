package String;

import java.util.Scanner;

class SumOfAllNumbersPresent {
    public void Sol(String str) {
        String s = str;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                result = result + Character.getNumericValue(s.charAt(i));
            }
        }
        System.out.println(result);
    }
}

public class SumOfAllNumbersPresentInTheString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Contains Number : ");
        String s = sc.next();

        SumOfAllNumbersPresent sumOfAllNumbersPresent = new SumOfAllNumbersPresent();

        sumOfAllNumbersPresent.Sol(s);
    }
}
