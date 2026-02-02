/*2. Consider the already defined EMPLOYEE class. Provide a default constructor, and 
parameterized constructor. Also provide a display method. Illustrate all the 
constructors as well as the display method by defining EMPLOYEE objects.  */
class EMPLOYEE {
    String name;
    int empId;
    double salary;

    EMPLOYEE() {
        name = "Not Assigned";
        empId = 0;
        salary = 0.0;
    }

    EMPLOYEE(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class Qn2 {
    public static void main(String[] args) {
        EMPLOYEE e1 = new EMPLOYEE();
        EMPLOYEE e2 = new EMPLOYEE("Amit", 2001, 45000);

        e1.display();
        e2.display();
    }
}

