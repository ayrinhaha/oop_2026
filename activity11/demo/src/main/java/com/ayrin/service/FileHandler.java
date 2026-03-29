package com.ayrin.service;

import com.ayrin.model.Employee;
import com.ayrin.model.Employee.EmployeeType;
import com.ayrin.model.HourlyEmployee;
import com.ayrin.model.SalariedEmployee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "employees.json";
    private Gson gson;

    public FileHandler() {
       
        RuntimeTypeAdapterFactory<Employee> adapter = RuntimeTypeAdapterFactory
            .of(Employee.class, "type", true) 
            .registerSubtype(SalariedEmployee.class, EmployeeType.SALARIED.name())
            .registerSubtype(HourlyEmployee.class, EmployeeType.HOURLY.name());

        
        this.gson = new GsonBuilder()
            .registerTypeAdapterFactory(adapter)
            .setPrettyPrinting()
            .create();
    }

    public void saveEmployees(ArrayList<Employee> employees) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(employees, writer);
            System.out.println("Records successfully saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public ArrayList<Employee> loadEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>(); 
        }

        try (FileReader reader = new FileReader(file)) {
            Type listType = new TypeToken<ArrayList<Employee>>() {}.getType();
            ArrayList<Employee> list = gson.fromJson(reader, listType);
            return list != null ? list : new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}