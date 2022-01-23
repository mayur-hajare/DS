package String;

import java.util.Scanner;

class Solution {
    public void Sol(String str) {
        // Remove All Symbol and number from String

        System.out.println(str.replaceAll("[^a-zA-Z]", ""));

        // Remove All space from String

        //System.out.println(str.replaceAll(" ", ""));


    }
}

public class RemoveCharactersInAtringExceptAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        Solution sol = new Solution();
        sol.Sol(s);
    }
}
