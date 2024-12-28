package org.example;

public class Employee {
    boolean attendance = false;
    int normalWorkDay=8;
    int salaryPerHour=20;
    double dailySalary=0;
    double salaryPerMonth =0;
    public void attendance(boolean a){
        if (a){
            attendance=a;
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
    public void EmployeeWages(){
        if(attendance){
            dailySalary=normalWorkDay*salaryPerHour;
            System.out.println(dailySalary);
        }
        else {
            dailySalary=0;
            System.out.println(dailySalary);
        }
    }
    public double SalaryPerMonth(){
        salaryPerMonth = dailySalary*20;
        return salaryPerMonth;
    }
}
