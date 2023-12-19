package EmployeeWageComputations;

public class EmployeeWageComputation {

    final int WAGE_PER_HOUR = 20;
    final int FULL_DAY_HOUR = 8;

    // UC1: Check Attendance
    public void checkAttendance() {
        int attendance = (int) (Math.random() * 2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    // UC2: Calculate Daily Wage
    public void calculateDailyWage() {
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Daily Wage: " + dailyWage);
    }

    public static void main(String[] args) {
        EmployeeWageComputation ewc = new EmployeeWageComputation();

        ewc.checkAttendance();
        ewc.calculateDailyWage();
    }
}
