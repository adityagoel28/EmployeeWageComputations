package EmployeeWageComputations;

public class WageCalculator {
    public static int computeDailyWage(Company company, EmployeeWageComputation.Status attendanceStatus) {
        int wagePerHour = company.getWagePerHour();
        switch (attendanceStatus) {
            case FULL_TIME:
                return wagePerHour * EmployeeWageComputation.FULL_DAY_HOUR;
            case PART_TIME:
                return wagePerHour * EmployeeWageComputation.PART_TIME_HOUR;
            default:
                return 0;
        }
    }

    public static int computeMonthlyWage(Company company) {
        int totalWage = 0;
        int totalWorkingHours = 0;
        int workingDays = 0;
        while (workingDays < company.getMaxWorkingDays() && totalWorkingHours < company.getMaxWorkingHours()) {
            EmployeeWageComputation.Status attendanceStatus = EmployeeWageComputation.getAttendance();
            int dailyWage = computeDailyWage(company, attendanceStatus);
            totalWage += dailyWage;
            totalWorkingHours += (attendanceStatus == EmployeeWageComputation.Status.FULL_TIME) ? EmployeeWageComputation.FULL_DAY_HOUR : (attendanceStatus == EmployeeWageComputation.Status.PART_TIME ? EmployeeWageComputation.PART_TIME_HOUR : 0);

            System.out.println("For Company:" + company.getName() + ": Day " + (workingDays + 1) + ": " + attendanceStatus + " - Wage Earned: " + dailyWage); // Prints daily wage
            workingDays++;

            if (totalWorkingHours >= company.getMaxWorkingHours()) {
                break;
            }
        }
        return totalWage;
    }
}
