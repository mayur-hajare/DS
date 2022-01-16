package String;

import java.util.Scanner;

class Sol {
    String str;

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        str = sc.nextLine();
    }

    public void Find() {
        if (str.length() < 3) {
            System.out.println("Enter String more than  3 char...");
        } else if (str.contains("ing")) {
            str = str + "ly";
        } else {
            str = str + "ing";

        }
        System.out.println(str);
    }

}

public class first {
    public static void main(String[] args) {
        Sol s = new Sol();
        s.Input();
        s.Find();
    }
}
