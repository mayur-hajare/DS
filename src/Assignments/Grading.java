package Assignments;

import java.util.Scanner;

class Sol {
    public void G(int s1, int s2, int s3, int s4, int s5) {

        int total = s1 + s2 + s3 + s4 + s5;
        float per = total / 5;

        System.out.println("Percentage :" + per);
        if (per > 90) {
            System.out.println("Bravo    A++");
        } else if (per > 75) {
            System.out.println("Excellent..!    A+");
        } else if (per < 75 && per > 60) {
            System.out.println("Very Good..!    A");
        } else if (per < 60 && per > 35) {
            System.out.println("Good    B");
        } else {
            System.out.println("Fail");
        }

    }

}

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5;

       /* for (int i=0;i<5;i++){
            System.out.print("Enter Marks for "+i+" Subject:");

        }*/
        System.out.print("Enter mark for subject 1: ");
        sub1 = sc.nextInt();

        System.out.print("Enter mark for subject 2: ");
        sub2 = sc.nextInt();

        System.out.print("Enter mark for subject 3: ");
        sub3 = sc.nextInt();

        System.out.print("Enter mark for subject 4: ");
        sub4 = sc.nextInt();

        System.out.print("Enter mark for subject 5: ");
        sub5 = sc.nextInt();

        Sol s = new Sol();
        s.G(sub1, sub2, sub3, sub4, sub5);

    }
}
