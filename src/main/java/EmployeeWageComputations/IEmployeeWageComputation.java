package EmployeeWageComputations;

import java.util.List;

public interface IEmployeeWageComputation {
    void addCompany(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    void computeWage();
    int getTotalWage(String companyName);

    List<Integer> getDailyWage(String companyName);

}
