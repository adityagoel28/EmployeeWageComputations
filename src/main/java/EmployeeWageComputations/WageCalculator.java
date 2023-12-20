package EmployeeWageComputations;

public class WageCalculator {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    public static int computeDailyWage(EmployeeWageComputation.Status attendanceStatus) {
        switch (attendanceStatus) { // Computes daily wage based on attendance status
            case FULL_TIME:
                return WAGE_PER_HOUR * FULL_DAY_HOUR;
            case PART_TIME:
                return WAGE_PER_HOUR * PART_TIME_HOUR;
            default:
                return 0;
        }
    }
}
