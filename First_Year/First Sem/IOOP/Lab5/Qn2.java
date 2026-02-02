/*2.     Employee Class 
Implement an EMPLOYEE class with an inner class named Department that handles 
department-related details. The inner class Department should: 
a. Contain fields for departmentName and location. 
b. Provide methods to set and display department details. 
The EMPLOYEE class should: 
Contain fields for eName (employee name), salary, and an array of Department objects. 
Provide methods to: 
c) Add departments. 
d) Display employee details along with department information.  */

import java.util.Scanner;

class EMPLOYEE {
    String eName;
    double salary;
    Department[] departments;
    int count;

    class Department {
        String departmentName;
        String location;

        Department(String d, String l) {
            departmentName = d;
            location = l;
        }

        void display() {
            System.out.println("Department: " + departmentName + ", Location: " + location);
        }
    }

    EMPLOYEE(String name, double salary, int n) {
        this.eName = name;
        this.salary = salary;
        departments = new Department[n];
        count = 0;
    }

    void addDepartment(String d, String l) {
        departments[count++] = new Department(d, l);
    }

    void display() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: " + salary);
        for (int i = 0; i < count; i++) {
            departments[i].display();
        }
    }
}

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double sal = sc.nextDouble();
        System.out.print("Number of Departments: ");
        int n = sc.nextInt();
        sc.nextLine();

        EMPLOYEE e = new EMPLOYEE(name, sal, n);

        for (int i = 0; i < n; i++) {
            System.out.print("Department Name: ");
            String d = sc.nextLine();
            System.out.print("Location: ");
            String l = sc.nextLine();
            e.addDepartment(d, l);
        }

        e.display();
    }
}
