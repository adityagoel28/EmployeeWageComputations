package EmployeeWageComputations;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class EmpWageBuilder implements IEmployeeWageComputation {
    private Map<String, Company> companies;

    public EmpWageBuilder() {
        companies = new HashMap<>();
    }

    @Override
    public void addCompany(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        Company company = new Company(name, wagePerHour, maxWorkingDays, maxWorkingHours);
        companies.put(name, company);
    }

    @Override
    public void computeWage() {
        for(String companyName : companies.keySet()) { // keySet() returns a Set view of the keys contained in the map
            Company company = companies.get(companyName);
            int totalWage = WageCalculator.computeMonthlyWage(company);
            company.setTotalWage(totalWage);
            System.out.println("Total Monthly Wage for " + companyName + ": " + totalWage);
        }
    }

    @Override
    public int getTotalWage(String companyName) {
        Company company = companies.get(companyName);
        return company != null ? company.getTotalWage() : 0;
    }

    // getDailyWage() method
    public List<Integer> getDailyWage(String companyName) {
        Company company = companies.get(companyName);
        return company != null ? company.getDailyWages() : null;
    }
}
