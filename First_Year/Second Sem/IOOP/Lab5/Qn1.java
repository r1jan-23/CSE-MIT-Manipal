/*1.     Student Class 
Enhance the STUDENT class by adding an inner class named Subject that handles details of 
individual subjects. Where: 
a) The inner class Subject should: 
a. Contain fields for subjectName and marks. 
b. Provide methods to assign marks and display subject details. 
b) The STUDENT class should maintain an array of Subject objects. 
c) The STUDENT class should: 
a. Provide methods to add subjects. 
d) Calculate total and average marks by iterating over the Subject objects. */

import java.util.Scanner;

class STUDENT {
    String name;
    int regNo;
    Subject[] subjects;
    int count;

    class Subject {
        String subjectName;
        int marks;

        Subject(String subjectName, int marks) {
            this.subjectName = subjectName;
            this.marks = marks;
        }

        void display() {
            System.out.println(subjectName + " : " + marks);
        }
    }

    STUDENT(String name, int regNo, int n) {
        this.name = name;
        this.regNo = regNo;
        subjects = new Subject[n];
        count = 0;
    }

    void addSubject(String sName, int marks) {
        subjects[count++] = new Subject(sName, marks);
    }

    void display() {
        int total = 0;
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        for (int i = 0; i < count; i++) {
            subjects[i].display();
            total += subjects[i].marks;
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + (total / count));
    }
}

public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Reg No: ");
        int reg = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        STUDENT s = new STUDENT(name, reg, n);

        for (int i = 0; i < n; i++) {
            System.out.print("Subject Name: ");
            String sub = sc.nextLine();
            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            s.addSubject(sub, marks);
        }

        s.display();
    }
}
