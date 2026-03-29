package com.ayrin.model;

import java.util.Objects;

public abstract class Employee {
    private String name;
    private String employeeId;
    protected EmployeeType type;

    public enum EmployeeType {
        SALARIED,
        HOURLY
    }   

    public Employee(String name, String employeeId, EmployeeType type) {
        this.name = name;
        this.employeeId = employeeId;
        this.type = type;
    }

    public abstract double calculateEarnings();

    @Override
    public String toString() {
        return String.format("Name: %s | ID: %s | Type: %s | Earnings: $%.2f", 
                name, employeeId, type, calculateEarnings());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (!(o instanceof Employee)) return false; 

        Employee other = (Employee) o;
        return this.employeeId.equals(other.employeeId); 
    }
}