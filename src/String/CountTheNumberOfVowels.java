package String;

import java.util.Scanner;

class Vowels {
    int v = 0;

    public void no_Vowels(String str, int len) {


        for (int i = 0; i < len; i++) {
            Character c = str.charAt(i);
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                v++;
            }
        }
        System.out.print("No of Vowels is : " + v);
    }
}

public class CountTheNumberOfVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ay String :");
        String s = sc.next();
        Vowels v = new Vowels();
        v.no_Vowels(s, s.length());

    }
}
