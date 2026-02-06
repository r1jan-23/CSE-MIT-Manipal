/*3. To the already defined Student class, add the following methods: 
i. extractInitials(): A method that extracts the initials from the student's name. 
For example, if the student's name is "John Doe", this method would return "JD". 
ii. removeWhitespace(): A method that removes any whitespace characters 
from the student's name. For example, if the student's name is "John Doe", 
this method would transform it to "JohnDoe".  
iii. List all the student names containing a particular substring. 
iv. Sort the students alphabetically 
In a separate class that contains main(), read the students details from console input. 
After displaying the details of all the students, illustrate the use of the above methods. */
import java.util.Scanner;
import java.util.Arrays;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    String extractInitials() {
        String[] parts = name.trim().split("\\s+");
        String initials = "";
        for (String p : parts) {
            initials += Character.toUpperCase(p.charAt(0));
        }
        return initials;
    }

    void removeWhitespace() {
        name = name.replaceAll("\\s+", "");
    }

    void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name);
    }
}

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(name, roll);
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }

        System.out.println("\nStudent Initials:");
        for (Student s : students) {
            System.out.println(s.name + " -> " + s.extractInitials());
        }

        System.out.println("\nAfter Removing Whitespace:");
        for (Student s : students) {
            s.removeWhitespace();
            s.display();
        }

        System.out.print("\nEnter substring to search: ");
        String sub = sc.nextLine();

        System.out.println("Students containing substring:");
        for (Student s : students) {
            if (s.name.toLowerCase().contains(sub.toLowerCase())) {
                s.display();
            }
        }

        Arrays.sort(students, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nStudents Sorted Alphabetically:");
        for (Student s : students) {
            s.display();
        }
    }
}
