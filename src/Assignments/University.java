package Assignments;

import java.util.Scanner;

class admission {
    private int student_id, marks, age;
    Boolean v_marks = false, v_age = false;
    Scanner sc = new Scanner(System.in);

    public int getStudent_id() {
        System.out.println("Enter id : ");
        student_id = sc.nextInt();
        return student_id;
    }

    public int getMarks() {
        System.out.println("Enter marks : ");
        marks = sc.nextInt();
        return marks;
    }

    public int getAge() {
        System.out.println("Enter age : ");
        age = sc.nextInt();
        return age;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void process() {

        if (validate_age() && validate_marks() && marks >= 65) {

            System.out.println("TRUE");

        } else {
            System.out.println("FALSE");
        }

    }

    public Boolean validate_marks() {

        if (marks >= 0 && marks <= 100) {
            v_marks = true;
        }
        return v_marks;
    }

    public Boolean validate_age() {

        if (age > 20) {
            v_age = true;
        }
        return v_age;
    }
}

public class University {
    public static void main(String[] args) {
        admission admission = new admission();
        admission.getStudent_id();
        admission.getAge();
        admission.getMarks();
//        admission.setStudent_id(101);
//        admission.setMarks(68);
//        admission.setAge(22);

        admission.process();

    }
}
