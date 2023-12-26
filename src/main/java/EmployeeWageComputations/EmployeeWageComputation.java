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

        Company companyA = new Company("CompanyA", 20, 20, 100);
        EmpWageBuilder builderA = new EmpWageBuilder(companyA);
        builderA.computeWage();
        System.out.println("\nTotal Monthly Wage for " + companyA.getName() + ": " + builderA.getTotalWage());

        Company companyB = new Company("CompanyB", 22, 22, 120);
        EmpWageBuilder builderB = new EmpWageBuilder(companyB);
        builderB.computeWage();
        System.out.println("\nTotal Monthly Wage for " + companyB.getName() + ": " + builderB.getTotalWage());
    }
}
