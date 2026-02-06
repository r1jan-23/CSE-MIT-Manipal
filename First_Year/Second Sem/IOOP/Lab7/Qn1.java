/*1. To the already defined STUDENT class, add two subclasses ScienceStudent and 
ArtsStudent and implement the following: 
i) Add a data member practicalMarks (int) to the ScienceStudent class that 
represents the marks obtained by the student in the laboratory subject. The 
ScienceStudent class should override the compute() method to include the 
practical marks in the total marks and average marks calculation. Additionally, 
the ScienceStudent class should provide a method displayPracticalMarks() to 
display the practical marks obtained by the science student.  
ii) Add a data member electiveSubject (String): to the ArtsStudent class that 
represents the elective subject chosen by the arts student. Also, add appropriate 
constructors to the subclasses.  
In main(), create objects of STUDENT, ScienceStudent, and ArtsStudent, and 
demonstrate the keyword ‘super’ and other functionalities of the classes by assigning 
values, computing marks, and displaying the information of the students. Also, 
demonstrate dynamic polymorphism.  */
import java.util.Scanner;

class STUDENT {
    protected String name;
    protected int rollNo;
    protected int[] marks;
    protected int total;
    protected double average;

    STUDENT(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void compute() {
        total = 0;
        for (int m : marks) {
            total += m;
        }
        average = (double) total / marks.length;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

class ScienceStudent extends STUDENT {
    private int practicalMarks;

    ScienceStudent(String name, int rollNo, int[] marks, int practicalMarks) {
        super(name, rollNo, marks);
        this.practicalMarks = practicalMarks;
    }

    @Override
    void compute() {
        super.compute();
        total = total + practicalMarks;
        average = (double) total / (marks.length + 1);
    }

    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}

class ArtsStudent extends STUDENT {
    private String electiveSubject;

    ArtsStudent(String name, int rollNo, int[] marks, String electiveSubject) {
        super(name, rollNo, marks);
        this.electiveSubject = electiveSubject;
    }

    void displayElective() {
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class Qn1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name, roll number and number of subjects:");
        String name1 = sc.nextLine();
        int roll1 = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println("Enter marks of "+n1+" Subject");
        int[] marks1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            marks1[i] = sc.nextInt();
        }

        STUDENT s1 = new STUDENT(name1, roll1, marks1);
        s1.compute();
        s1.display();

        System.out.println();

        sc.nextLine();
        System.out.println("Enter science student name and roll number:");
        String name2 = sc.nextLine();
        int roll2 = sc.nextInt();
        System.out.println("Enter number of theory subjects:");
        int n2 = sc.nextInt();
        System.out.println("Enter marks of "+n2+" Subject");
        int[] marks2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            marks2[i] = sc.nextInt();
        }

        System.out.println("Enter practical marks:");
        int practical = sc.nextInt();

        STUDENT s2 = new ScienceStudent(name2, roll2, marks2, practical);
        s2.compute();
        s2.display();
        ((ScienceStudent) s2).displayPracticalMarks();

        System.out.println();

        sc.nextLine();
        System.out.println("Enter arts student name and roll number:");
        String name3 = sc.nextLine();
        int roll3 = sc.nextInt();
        System.out.println("Enter number of subjects:");
        int n3 = sc.nextInt();
        System.out.println("Enter marks of "+n3+" Subject");

        int[] marks3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            marks3[i] = sc.nextInt();
        }

        sc.nextLine();
        System.out.println("Enter elective subject:");
        String elective = sc.nextLine();

        STUDENT s3 = new ArtsStudent(name3, roll3, marks3, elective);
        s3.compute();
        s3.display();
        ((ArtsStudent) s3).displayElective();

        sc.close();
    }
}
