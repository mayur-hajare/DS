package String;

import java.util.Scanner;

class Rev {
    StringBuilder sb = new StringBuilder("ruyaM");
    StringBuilder sb1 = new StringBuilder("Hajare");

    public void Rs() {
        System.out.println(sb.reverse());

        for (int i = sb1.length() - 1; i >= 0; i--) {
            System.out.print(sb1.charAt(i));
        }

    }


}


public class Reverse_String {
    public static void main(String[] args) {

        Rev rev = new Rev();
        rev.Rs();

    }
}
