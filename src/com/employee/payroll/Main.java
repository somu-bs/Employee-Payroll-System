package com.employee.payroll;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        Employee employee = new PartTimeEployee("Rahul", 123, 12, 100);
        Employee employee2 = new FullTimeEmployee("Vikas", 146, 27000);
//        System.out.println(employee.toString());
        payrollSystem.addEmployee(employee);
        payrollSystem.addEmployee(employee2);
        payrollSystem.displayEmployees();

        payrollSystem.removeEmployee(123);
        System.out.println("After removing Employee");
        payrollSystem.displayEmployees();
//        System.out.println(employee.getId());

    }
}
