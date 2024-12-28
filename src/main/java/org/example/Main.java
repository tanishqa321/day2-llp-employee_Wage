package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Employee Wage Computation");
        Employee e1 = new Employee();
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

       while(totalWorkingHours<=100 && totalWorkingDays<=20) {
           Random r1 = new Random();
           int i = (r1.nextInt(1000)) % 3;

           switch (i) {
               case 1 -> {
                   totalWorkingDays+=1;
                   totalWorkingHours+=8;
                   e1.attendance(true);
               }
               case 2 -> {
                   totalWorkingDays+=1;
                   totalWorkingHours+=4;
                   e1.attendance(true);
                   System.out.println("Part time today");
                   e1.normalWorkDay = 4;
               }
               default -> e1.attendance(false);
           }
       }
        System.out.println("Employee Wage per day: " );
        e1.EmployeeWages();
        System.out.println("Total working hour is: " +totalWorkingHours + " and total Working Days are: "+totalWorkingDays);
        System.out.println("Employee Wage per month: " + totalWorkingHours*20 );

    }
}
