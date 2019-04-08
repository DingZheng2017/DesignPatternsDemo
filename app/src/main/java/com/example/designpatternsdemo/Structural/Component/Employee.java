package com.example.designpatternsdemo.Structural.Component;

import com.example.designpatternsdemo.Creational.PhotoType.Product;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Employee> subordinates;

    public Employee(String name) {
        this.name = name;
        subordinates = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }


}
