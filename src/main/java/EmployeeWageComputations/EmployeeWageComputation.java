package EmployeeWageComputations;

import java.util.Random;

class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    enum Status {
        FULL_TIME, ABSENT;
    }

    public static Status getAttendance() {
        int chance = new Random().nextInt(3); // Generates a random number between 0 and 2
        return chance == 0 ? Status.ABSENT : Status.FULL_TIME;
    }

    public static int computeDailyWage(Status attendanceStatus) {
        switch (attendanceStatus) {
            case FULL_TIME:
                return WAGE_PER_HOUR * FULL_DAY_HOUR;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
}