package EmployeeWageComputations;

public class EmployeeWageComputation {

    // UC1: Check Attendance
    public void checkAttendance() {
        int attendance = (int) (Math.random() * 2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        EmployeeWageComputation ewc = new EmployeeWageComputation();

        ewc.checkAttendance();
    }
}
