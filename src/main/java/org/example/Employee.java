package org.example;

public class Employee {
    private boolean attendance;
    private  int normalWorkDay = 8;
    private final int salaryPerHour = 20;
    private double dailySalary;
    private double salaryPerMonth;
    public void setNormalWorkDay(int normalWorkDay) {
        if (normalWorkDay > 0) { // Validation to ensure the value is positive
            this.normalWorkDay = normalWorkDay;
        } else {
            System.out.println("Invalid work hours! Must be greater than 0.");
        }
    }

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
