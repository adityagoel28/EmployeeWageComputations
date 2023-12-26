package EmployeeWageComputations;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    public int totalWage;
    private List<Integer> dailyWages;

    public Company(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours) { // constructor
        this.name = name; // this keyword refers to the current object
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
        this.dailyWages = new ArrayList<>();
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public int getTotalWage() { return totalWage; }

    public void addDailyWage(int dailyWage) {
        dailyWages.add(dailyWage);
    }

    public List<Integer> getDailyWages() {
        return dailyWages;
    }

    // Getters and Setters
    public String getName() { return name; } // getter method - returning the value of the attribute
    public int getWagePerHour() { return wagePerHour; }
    public int getMaxWorkingDays() { return maxWorkingDays; }
    public int getMaxWorkingHours() { return maxWorkingHours; }
}
