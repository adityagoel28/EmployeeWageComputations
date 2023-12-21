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

        Company companyA = new Company("CompanyA", 20, 20, 100); // Company(name, wagePerHour, maxWorkingDays, maxWorkingHours)
        Company companyB = new Company("CompanyB", 22, 22, 120);

        int totalWageCompanyA = WageCalculator.computeMonthlyWage(companyA);
        System.out.println("\nTotal Monthly Wage for " + companyA.getName() + ": " + totalWageCompanyA);

        int totalWageCompanyB = WageCalculator.computeMonthlyWage(companyB);
        System.out.println("\nTotal Monthly Wage for " + companyB.getName() + ": " + totalWageCompanyB);
    }
}
