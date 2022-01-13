import java.util.Scanner;

class Sol {
    String type;
    int plate, dis;

    Sol(String t, int p, int d) {
        type = t;
        plate = p;
        dis = d;

    }

    public int Distance() {
        int result = 0;
        if (dis <= 3) {
            return result;
        } else if (dis >= 3 && dis <= 6) {
            dis = dis - 3;
            result = dis * 3;
        }
        if (dis > 6) {
            dis = dis - 3;
            result = (dis - 3) * 6;
            result = (result + 3) * 3;
        }

        return result;

    }

    public int find() {
        int result = -1;
        int d = Distance();
        if (plate > 0 && dis > 0) {
            if (type.equals("V")) {

                result = (plate * 120) + d;
            }
            if (type.equals("N")) {
                result = (plate * 150) + d;
            }
        } else {
            return -1;
        }
        return result;
    }
}

public class Res {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type;
        System.out.println("Enter V for Veg and N for Non-veg");

        type = sc.next();

        System.out.println("Enter No of plates : ");
        int plates = sc.nextInt();

        System.out.println("Enter Your Address Distance in KM :");
        int km = sc.nextInt();

        Sol s = new Sol(type, plates, km);
        s.Distance();
        System.out.println(s.find());

    }
}
