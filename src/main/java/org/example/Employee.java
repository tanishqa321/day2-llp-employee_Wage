package org.example;

import java.util.Random;

public class Employee {
    // Constants
    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;

    // Class method to compute employee wage for a given company
    public static void computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        System.out.println("\nCalculating wages for company: " + company);

        while (totalWorkingHours <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empHrs = 0;

            // Generate attendance randomly (0, 1, 2)
            Random random = new Random();
            int attendance = random.nextInt(3);

            // Determine hours based on attendance
            switch (attendance) {
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Day " + totalWorkingDays + ": Part-time work. Hours: " + empHrs);
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Day " + totalWorkingDays + ": Full-time work. Hours: " + empHrs);
                    break;
                default:
                    System.out.println("Day " + totalWorkingDays + ": Employee is absent.");
            }

            totalWorkingHours += empHrs;

            // Ensure total working hours don't exceed the max limit
            if (totalWorkingHours > maxHoursPerMonth) {
                totalWorkingHours -= empHrs;
                break;
            }
        }

        // Calculate total wage
        int totalEmpWage = totalWorkingHours * empRatePerHour;

        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Employee Wage for " + company + ": $" + totalEmpWage);
    }
}
