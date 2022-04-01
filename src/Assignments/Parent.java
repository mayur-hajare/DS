package Assignments;

class Parent {
    public void displayChild() {
        System.out.println("i am in Parent..");
    }

}

class Child extends Parent {
    public void displayParent() {

        System.out.println("i am in Child..");
    }

    public static void main(String[] args) {


        Child child = new Child();
        child.displayChild();
        child.displayParent();

        /*Parent parent = new Parent();
        parent.displayParent();
        parent.displayChild();*/

    }
}

