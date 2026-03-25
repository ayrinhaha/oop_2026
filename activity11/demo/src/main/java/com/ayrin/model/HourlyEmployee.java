package com.ayrin.model;

public class HourlyEmployee extends Employee {
    
   
    private int hoursWorked;
    private double hourlyRate;
    
    public HourlyEmployee(String name, String employeeId, EmployeeType type, int hoursWorked, double hourlyRate) {
        super(name, employeeId, type);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateEarnings() {
       return hoursWorked * hourlyRate;
    }


    
}
