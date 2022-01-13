import java.util.Scanner;

class Find {
    int x, y, amount;

    Find(int a, int b, int at) {
        x = a;
        y = b;
        amount = at;

    }

    public void count() {
        float r = amount / 5.0f;
        int r1 = amount % 5;
        System.out.println("Rs .5 notes needed :" + (int) r);

        if (r1 > y) {
            System.out.println("-1");

        } else {
            System.out.println("RS . 1 coins needed : " + r1);

        }
    }

}

public class Assignment {
    public static void main(String[] args) {

        int x, y, amount;
        System.out.println("Enter Available 1 coins : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("Enter Available 5 coins : ");
        y = sc.nextInt();
        System.out.println("Enter Amount : ");
        amount = sc.nextInt();

        Find f = new Find(x, y, amount);
        f.count();
    }
}
