package com.ayrin;

import com.ayrin.model.Employee;
import com.ayrin.model.HourlyEmployee;
import com.ayrin.model.SalariedEmployee;
import com.ayrin.service.FileHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();

        // auto-load records on startup
        ArrayList<Employee> employees = fileHandler.loadEmployees();
        System.out.println("System initialized. Loaded " + employees.size() + " records.");

        while (true) {
            System.out.println("\n--- PAYROLL MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Save Records");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Employee ID: ");
                String id = sc.nextLine();

                System.out.print("Select Type:\n[1] Salaried\n[2] Hourly): ");
                String typeChoice = sc.nextLine();

                if (typeChoice.equals("1")) {
                    System.out.print("Enter Base Salary: ");
                    double base = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter Bonus: ");
                    double bonus = Double.parseDouble(sc.nextLine());
                    employees.add(new SalariedEmployee(name, id, base, bonus));
                    System.out.println("Salaried Employee added successfully!");
                } else if (typeChoice.equals("2")) {
                    System.out.print("Enter Hours Worked: ");
                    int hours = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Hourly Rate: ");
                    double rate = Double.parseDouble(sc.nextLine());
                    employees.add(new HourlyEmployee(name, id, hours, rate));
                    System.out.println("Hourly Employee added successfully!");
                } else {
                    System.out.println("Invalid type selected.");
                }
            } else if (choice.equals("2")) {
                System.out.println("\n--- EMPLOYEE DIRECTORY ---");
                if (employees.isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    for (Employee e : employees) {
                        System.out.println(e.toString());

                    }
                }
            } else if (choice.equals("3")) {
                fileHandler.saveEmployees(employees);
            } else if (choice.equals("4")) {
                System.out.println("Exiting Payroll System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}