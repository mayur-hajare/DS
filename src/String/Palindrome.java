package String;


import java.util.Scanner;

class Pall {
    Scanner sc = new Scanner(System.in);
    String str = "";

    public void PD() {
        System.out.println("Enter Any String : ");
        str = sc.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) System.out.println("YES");
        else System.out.println("NO");
    }
}

public class Palindrome {
    public static void main(String[] args) {

        Pall pall = new Pall();
        pall.PD();

    }
}
