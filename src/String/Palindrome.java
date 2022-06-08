package String;


import java.util.Scanner;

class Pall {

    String rev = "";
    String st = "";

    public void PD(String str) {


        st = str;

        int m = 0, j = st.length() - 1;

        if (st.length() == 1) {
            System.out.println("YES");

        } else if (st.charAt(m) == st.charAt(j)) {
            if (m == j) {
                m++;
                j--;
                PD(str);
            }
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//
//
//        }


//        if (str.equals(rev)) System.out.println("YES");
//        else System.out.println("NO");
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        String str = sc.next();

        Pall pall = new Pall();
        pall.PD(str);

    }
}
