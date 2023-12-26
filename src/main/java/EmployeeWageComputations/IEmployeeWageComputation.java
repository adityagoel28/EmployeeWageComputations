package EmployeeWageComputations;

public interface IEmployeeWageComputation {
    void addCompany(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours);
    void computeWage();
    int getTotalWage(String companyName);
}
