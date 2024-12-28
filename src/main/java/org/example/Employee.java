package org.example;

public class Employee {
    boolean attendance = false;
    public void attendance(boolean a){
        if (a){
            attendance=a;
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
