package String;

import java.util.Scanner;

class Remove_Vowels {
    String str;

    public void Input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        str = sc.next();

    }

    public void FInd() {

        str = str.replaceAll("[a,e,i,o,u]", "");
        System.out.println(str);
    }

}

public class RemoveVowelsFromString {
    public static void main(String[] args) {

        Remove_Vowels rv = new Remove_Vowels();
        rv.Input();
        rv.FInd();
    }
}
