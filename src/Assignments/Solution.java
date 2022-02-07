package Assignments;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = 4;

        Student d[] = new Student[n];

        for (int i = 0; i < d.length; i++) {
            int compid = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int couempcountnt = sc.nextInt();
            sc.nextLine();
            double anulatrunover = sc.nextDouble();
            sc.nextLine();
            d[i] = new Student(compid, name, couempcountnt, anulatrunover);
        }

        double fs1 = sc.nextDouble();
        sc.nextLine();
        int fs2 = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i].getAnulatrunover() > fs1) {
                sum += d[i].getEmpcount();
            }
        }

        if (sum != 0) {
            System.out.println(sum);

        } else {
            System.out.println("no such Student found");

        }


        Student temp = null;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i].getAnulatrunover() > d[j].getAnulatrunover()) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
            }
        }






        int bc=0;
        // for (int i = 0; i < d.length-1; i++) {
        //     if (d[i].getCompid() == 101) {
        //         System.out.println(d[2].getName());
        //         System.out.println( d[2].getAnulatrunover());
        //        bc++;
        //     }
        // }

        if(bc==0)
            System.out.println("no such Student exists");




    }

}

class Student {
    private int compid;
    private String name;
    private int empcount;
    private double anulatrunover;

    public Student(int compid, String name, int empcount, double anulatrunover) {
        super();
        this.compid = compid;
        this.name = name;
        this.empcount = empcount;
        this.anulatrunover = anulatrunover;
    }

    public int getCompid() {
        return compid;
    }

    public void setCompid(int compid) {
        this.compid = compid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpcount() {
        return empcount;
    }

    public void setEmpcount(int empcount) {
        this.empcount = empcount;
    }

    public double getAnulatrunover() {
        return anulatrunover;
    }

    public void setAnulatrunover(double anulatrunover) {
        this.anulatrunover = anulatrunover;
    }

}


    //Student Code Java