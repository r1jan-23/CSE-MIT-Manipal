package mahe.main;

import java.util.Scanner;
import mahe.employee.Employee;
import mahe.department.Department;
import mahe.payroll.Payroll;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();
        double basicSalary = sc.nextDouble();
        sc.nextLine();

        String deptName = sc.nextLine();
        String manager = sc.nextLine();
        String location = sc.nextLine();

        Employee emp = new Employee(id, name, age, basicSalary);
        Department dept = new Department(deptName, manager, location);
        Payroll payroll = new Payroll(emp, dept);

        payroll.generatePaySlip();
        sc.close();
    }
}
