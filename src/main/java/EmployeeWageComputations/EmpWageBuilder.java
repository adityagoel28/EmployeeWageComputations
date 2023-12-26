package EmployeeWageComputations;

public class EmpWageBuilder {
    private Company company;

    public EmpWageBuilder(Company company) {
        this.company = company;
    }

    public void computeWage() {
        int totalWage = WageCalculator.computeMonthlyWage(company);
        company.setTotalWage(totalWage);
    }

    public int getTotalWage() {
        return company.getTotalWage();
    }
}
