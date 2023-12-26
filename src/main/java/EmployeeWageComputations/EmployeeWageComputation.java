package EmployeeWageComputations;

import java.util.Random;

public class EmployeeWageComputation {
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public enum Status {
        FULL_TIME, ABSENT, PART_TIME
    }

    public static Status getAttendance() {
        return Status.values()[new Random().nextInt(Status.values().length)]; // Returns a random value from the Status enum
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        IEmployeeWageComputation empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompany("CompanyA", 20, 20, 100);
        empWageBuilder.addCompany("CompanyB", 22, 22, 120);

        empWageBuilder.computeWage(); // Computes wage for each company
        // Prints daily wage for each company
        System.out.println("Daily Wage for CompanyA: " + empWageBuilder.getDailyWage("CompanyA"));
        System.out.println("Daily Wage for CompanyB: " + empWageBuilder.getDailyWage("CompanyB"));

        System.out.println("Total Wage for CompanyA: " + empWageBuilder.getTotalWage("CompanyA"));
        System.out.println("Total Wage for CompanyB: " + empWageBuilder.getTotalWage("CompanyB"));
    }
}
