import java.util.Scanner;

class Student {
    private String name;
    private int age;

    void registerStudent(String name, int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Age must be between 18 and 60");
        }
        this.name = name;
        this.age = age;
        System.out.println("Student Registered Successfully");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentAgeValidationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        try {
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            s.registerStudent(name, age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
