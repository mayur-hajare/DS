package Assignments;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Circle {
    int rad, len, bre;

    public static void area(int r) {
        float a = (r * 2) * 3.14f;
        System.out.println("Area : " + a);

    }

    public static void area(int l, int b) {
        float area = l * b;
        System.out.println("Area of Rectangle :" + area);

    }


    public Circle(int r, int l, int b) {
        int radius = r;
        int length = l;
        int breadth = b;
    }

    public Circle(int r) {
        int radius = r;
    }

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Value : ");
        int r = sc.nextInt();
*/
        //Circle c = new Circle();

        //c.getdata(r);
        area(5);
        area(5, 10);

    }
}
