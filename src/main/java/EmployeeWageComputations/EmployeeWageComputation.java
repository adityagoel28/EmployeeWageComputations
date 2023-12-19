package EmployeeWageComputations;

import java.util.Random;

class EmployeeWageComputation {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

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


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
}