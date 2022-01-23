package String;

import java.util.Scanner;

class Replace {
    String str, strReplace, replaceStr;

    public void Input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        str = sc.nextLine();
        System.out.println("Enter String To be Replaced : ");
        strReplace = sc.nextLine();
        System.out.println("Enter String Replace with : ");
        replaceStr = sc.next();

    }

    public void sol() {

        str = str.replace(strReplace, replaceStr);
        System.out.println(str);

    }
}

public class ReplaceASubstringInAString {
    public static void main(String[] args) {

        Replace replace = new Replace();
        replace.Input();
        replace.sol();

    }
}
