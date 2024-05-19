package com.employee.payroll;

public class PartTimeEployee extends Employee {
    private int hourWorked;
    private double hourlyRate;

    public PartTimeEployee(String name, int id, int hourWorked, double hourlyRate) {
        super(name, id);
        this.hourWorked = hourWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourWorked*hourlyRate;
    }
}
