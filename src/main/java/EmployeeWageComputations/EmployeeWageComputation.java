package EmployeeWageComputations;

import java.util.Random;


class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int MAX_WORKING_HOURS = 100;
    static final int MAX_WORKING_DAYS = 20;

    enum Status {
        FULL_TIME, ABSENT, PART_TIME
    }

    public static Status getAttendance() {
        int chance = new Random().nextInt(3); // Generates a random number between 0 and 2
        return chance == 0 ? Status.ABSENT : (chance == 1 ? Status.FULL_TIME : Status.PART_TIME);
    }

    public static int computeDailyWage(Status attendanceStatus) {
        switch (attendanceStatus) {
            case FULL_TIME:
                return WAGE_PER_HOUR * FULL_DAY_HOUR;
            case PART_TIME:
                return WAGE_PER_HOUR * PART_TIME_HOUR;
            default:
                return 0;
        }
    }

    public static int computeMonthlyWage() {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int workingDays = 0;

        while (workingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            Status attendanceStatus = getAttendance();
            int dailyWage = computeDailyWage(attendanceStatus);
            totalWage += dailyWage;
            totalWorkingHours += (attendanceStatus == Status.FULL_TIME) ? FULL_DAY_HOUR : (attendanceStatus == Status.PART_TIME ? PART_TIME_HOUR : 0);

            // Output for each day
            System.out.println("Day " + (workingDays + 1) + ": " + attendanceStatus + " - Wage Earned: " + dailyWage);
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