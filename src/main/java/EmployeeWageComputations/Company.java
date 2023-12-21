package EmployeeWageComputations;

public class Company {
    private String name;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    public Company(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours) { // constructor
        this.name = name; // this keyword refers to the current object
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Getters and Setters
    public String getName() { return name; } // getter method - returning the value of the attribute
    public int getWagePerHour() { return wagePerHour; }
    public int getMaxWorkingDays() { return maxWorkingDays; }
    public int getMaxWorkingHours() { return maxWorkingHours; }
}
