package com.employee.payroll;

public abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee[Name: " + this.name + ", Id: " + this.id + ", Salary: " + calculateSalary() + "]";
    }
}
