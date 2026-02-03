/*2. To the already defined EMPLOYEE class, add two subclasses FullTimeEmp and 
PartTimeEmp and implement the following: 
i) Include the following data members to the PartTimeEmp class-hoursWorked (int) 
that represents the number of hours worked by the part-time employee and hourlyRate (double, static and final) that represents the hourly rate at which the part
time employee is paid. Also, override calculateSalary() and displayEmployeeDetails() splayEmployeeDetails() method of the base class to 
display the part-time employee's details, including the hours worked and hourly rate.  
ii) The FullTimeEmployee subclass includes the data members bonus and 
deductions as additional data members and are of type double and overrides the 
calculateSalary() and displayEmployeeDetails() methods to incorporate these factors.  
In main(), create various objects to illustrate the functionality of all the classes.  */
import java.util.Scanner;

class EMPLOYEE {
    protected int empId;
    protected String name;
    protected double salary;

    EMPLOYEE(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void calculateSalary() {
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class PartTimeEmp extends EMPLOYEE {
    private int hoursWorked;
    static final double hourlyRate = 250.0;

    PartTimeEmp(int empId, String name, int hoursWorked) {
        super(empId, name);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        salary = hoursWorked * hourlyRate;
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

class FullTimeEmp extends EMPLOYEE {
    private double bonus;
    private double deductions;
    private double basicSalary;

    FullTimeEmp(int empId, String name, double basicSalary, double bonus, double deductions) {
        super(empId, name);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    @Override
    void calculateSalary() {
        salary = basicSalary + bonus - deductions;
    }

    @Override
    void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
    }
}

public class Qn2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Part Time Employee ID, Name and Hours Worked:");
        int pid = sc.nextInt();
        sc.nextLine();
        String pname = sc.nextLine();
        int hours = sc.nextInt();

        EMPLOYEE e1 = new PartTimeEmp(pid, pname, hours);
        e1.calculateSalary();
        e1.displayEmployeeDetails();

        System.out.println();

        System.out.println("Enter Full Time Employee ID, Name, Basic Salary, Bonus, Deductions:");
        int fid = sc.nextInt();
        sc.nextLine();
        String fname = sc.nextLine();
        double basic = sc.nextDouble();
        double bonus = sc.nextDouble();
        double deductions = sc.nextDouble();

        EMPLOYEE e2 = new FullTimeEmp(fid, fname, basic, bonus, deductions);
        e2.calculateSalary();
        e2.displayEmployeeDetails();

        sc.close();
    }
}
