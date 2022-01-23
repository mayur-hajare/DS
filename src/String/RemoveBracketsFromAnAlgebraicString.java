package String;

import java.util.Scanner;

class RemoveBracketsFromAnAlgebraic {
    public void Sol(String str) {
        System.out.println(str.replaceAll("[(){}]", ""));
    }
}


public class RemoveBracketsFromAnAlgebraicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression : ");
        String s = sc.next();
        RemoveBracketsFromAnAlgebraic removeBracketsFromAnAlgebraic = new RemoveBracketsFromAnAlgebraic();
        removeBracketsFromAnAlgebraic.Sol(s);

    }
}
