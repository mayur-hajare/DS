package Assignments;

public class Triangle {
    private int a, b, c;

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.a = 12;
        triangle.b = 10;
        triangle.c = 11;
        triangle.perimeter(triangle.a, triangle.b, triangle.c);
        triangle.perimeter(triangle);

    }

    public void perimeter(int x, int y, int z) {

        System.out.println("Perimeter of Triangle : " + (x + y + z));

    }

    public void perimeter(Triangle t) {

        System.out.println("Perimeter of Triangle : " + (a + b + c));

    }
}
