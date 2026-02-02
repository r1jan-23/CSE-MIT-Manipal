/*2. To the already defined Employee class, add the following string processing methods: 
i. formatEmployeeName(): A method that formats the employee's name by 
capitalizing the first letter of each word and converting the remaining letters 
to lowercase. For example, if the employee's name is "JOHN DOE", this 
method would transform it to "John Doe".  
ii.  generateEmail(): A method that generates an email address for the employee 
based on their name. For example, if the employee's name is "John Doe", this 
method would generate an email address like jdoe@example.com. 
Illustrate the above methods upon creating an array of Employee objects. The details 
of each Employee object must be read from the user and initialized using the 
parameterised constructor.  */
import java.util.Scanner;

class Employee {
    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void formatEmployeeName() {
        String[] words = name.toLowerCase().split(" ");
        String formatted = "";

        for (String w : words) {
            formatted += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        name = formatted.trim();
    }

    String generateEmail() {
        String[] parts = name.toLowerCase().split(" ");
        return parts[0].charAt(0) + parts[parts.length - 1] + "@example.com";
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Email: " + generateEmail());
        System.out.println();
    }
}

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEmployee Name: ");
            String name = sc.nextLine();

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(name, id, sal);
            emp[i].formatEmployeeName();
        }

        System.out.println("\nEmployee Details\n");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}
