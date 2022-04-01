package Assignments;

import java.util.Scanner;

class Sol1 {
    public void cal(int l, int s, int b) {
        if ((l > 70 || s > 80 || b > 90) || (l < 0 & s < 0 & b < 0)) {
            System.out.println("sales Limit exceed or you enter negative value.");
        } else {
            long sales = (l * 45) + (s * 30) + (b * 25);
            System.out.println("Sales : " + sales);

            if (sales <= 1000) {
                System.out.println("you Got 10% Commission");
            } else if (sales > 1000 && sales <= 1800) {
                System.out.println("you Got 15% Commission");
            } else {
                System.out.println("you Got 20% Commission");

            }
        }

    }
}


public class Commission_Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of locks Sell :");
        int lock = sc.nextInt();

        System.out.println("Enter no of stock Sell :");
        int stock = sc.nextInt();

        System.out.println("Enter no of barrels Sell :");
        int barrels = sc.nextInt();

        Sol1 s = new Sol1();
        s.cal(lock, stock, barrels);

    }
}
