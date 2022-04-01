package Assignments;

class A {
    public void DisplayB() {

        System.out.println("I am in A..");

    }
}

class SubClass extends A {
    public void DisplaySubclass() {

        System.out.println("I am in Subclass..");

    }

    public static void main(String[] args) {

        SubClass subClass = new SubClass();
        subClass.DisplayB();
        subClass.DisplaySubclass();

    }

}

