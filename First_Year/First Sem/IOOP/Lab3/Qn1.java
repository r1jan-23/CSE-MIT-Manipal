/* 1. Define a Class STUDENT having following 
Members: sname, marks_array, total, avg and provide the following methods: 
a. assign(): to assign initial values to the STUDENT object 
b. display(): to display the STUDENT object 
c. compute(): to Compute Total, Average marks 
Write a Java program Illustrating Class Declarations, Definition, and Accessing Class 
Members to test the class defined. */
import java.util.Scanner;

class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    void assign(int n, Scanner sc) {
        System.out.print("Enter student name: ");
        sname = sc.nextLine();

        marks_array = new int[n];
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++)
            marks_array[i] = sc.nextInt();
        sc.nextLine();
    }

    void compute() {
        total = 0;
        for (int m : marks_array)
            total += m;
        avg = (double) total / marks_array.length;
    }

    void display() {
        System.out.println("Name: " + sname);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        STUDENT s = new STUDENT();
        s.assign(n, sc);
        s.compute();
        s.display();

        sc.close();
    }
}
