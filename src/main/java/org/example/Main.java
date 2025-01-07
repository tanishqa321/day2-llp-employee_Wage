package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Employee Wage Computation");

        // Compute wages for multiple companies
        Employee.computeEmployeeWage("CompanyA", 20, 20, 100);
        Employee.computeEmployeeWage("CompanyB", 25, 22, 120);
        Employee.computeEmployeeWage("CompanyC", 30, 25, 150);
    }
}
