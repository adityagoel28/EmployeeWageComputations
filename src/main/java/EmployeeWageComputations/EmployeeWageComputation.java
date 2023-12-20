package EmployeeWageComputations;

import java.util.Random;

public class EmployeeWageComputation {
    public static final int MAX_WORKING_HOURS = 100;
    public static final int MAX_WORKING_DAYS = 20;

    public enum Status {
        FULL_TIME, ABSENT, PART_TIME
    }

    public static Status getAttendance() {
        return Status.values()[new Random().nextInt(Status.values().length)];
    }

    public static int computeMonthlyWage() {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int workingDays = 0;

        while (workingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            Status attendanceStatus = getAttendance();
            int dailyWage = WageCalculator.computeDailyWage(attendanceStatus); // Computes daily wage based on attendance status
            totalWage += dailyWage;
            totalWorkingHours += (attendanceStatus == Status.FULL_TIME) ? WageCalculator.FULL_DAY_HOUR : (attendanceStatus == Status.PART_TIME ? WageCalculator.PART_TIME_HOUR : 0);

            System.out.println("Day " + (workingDays + 1) + ": " + attendanceStatus + " - Wage Earned: " + dailyWage); // Prints daily wage
            workingDays++;

            if (totalWorkingHours >= MAX_WORKING_HOURS) {
                break;
            }
        }

        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int totalWage = computeMonthlyWage();
        System.out.println("Total Monthly Wage: " + totalWage);
    }
}
