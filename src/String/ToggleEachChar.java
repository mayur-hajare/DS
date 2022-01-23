package String;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

class Toggle {
    public void toggle(String str, int len) {
        String s = "";

        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                s = s + Character.toLowerCase(str.charAt(i));
            } else {
                s = s + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(s);
    }

}

public class ToggleEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String :");
        String s;

        s = sc.next();

        Toggle t = new Toggle();
        t.toggle(s, s.length());
    }
}
