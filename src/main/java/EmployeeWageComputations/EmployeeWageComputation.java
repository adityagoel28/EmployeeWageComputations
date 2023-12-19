package EmployeeWageComputations;

import java.util.Random;

public class EmployeeWageComputation {

    // UC1: Check Attendance
    public static int getAttendance() {
        return new Random().nextInt(2);
    }

    public static void main(String[] args) {
        int is_present = getAttendance();
        if (is_present == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
