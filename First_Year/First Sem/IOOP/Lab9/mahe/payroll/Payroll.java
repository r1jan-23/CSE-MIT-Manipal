package mahe.payroll;

import mahe.employee.Employee;
import mahe.department.Department;

public class Payroll {
    private Employee employee;
    private Department department;
    private double netSalary;

    public Payroll(Employee employee, Department department) {
        this.employee = employee;
        this.department = department;
    }

    private void calculateNetSalary() {
        double da = 0.52 * employee.basicSalary;
        double gross = employee.basicSalary + da;
        double it = 0.30 * gross;
        netSalary = gross - it;
    }

    public void generatePaySlip() {
        calculateNetSalary();
        System.out.println("Payslip for January 2025");
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee age: " + employee.getAge());
        System.out.println("Employee department name: " + department.getDepartmentName());
        System.out.println("Employee Net Salary : " + netSalary);
    }
}
