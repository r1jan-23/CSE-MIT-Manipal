package mit.student.main;

import java.util.Scanner;
import mit.student.*;
import mit.course.*;
import mit.registration.*;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        double gpa = sc.nextDouble();
        sc.nextLine();

        String courseName = sc.nextLine();
        String instructor = sc.nextLine();
        int credits = sc.nextInt();

        Student student = new Student(name, roll, dept, gpa);
        Course course = new Course(courseName, instructor, credits);
        Registration reg = new Registration(student, course);

        reg.registerStudent();
        sc.close();
    }
}
