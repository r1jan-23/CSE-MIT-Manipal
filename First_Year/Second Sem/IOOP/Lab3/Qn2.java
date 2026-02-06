/*2. Define a class EMPLOYEE having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods: 
a. read(): to read N employee details 
b. display(): to display employee details 
c. compute_net_sal(): to compute net salary 
Write a Java program to read data of N employee and compute and display net salary of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary)  */

import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    void read(Scanner sc) {
        System.out.print("Enter employee name: ");
        Ename = sc.nextLine();

        System.out.print("Enter employee ID: ");
        Eid = sc.nextInt();

        System.out.print("Enter basic salary: ");
        Basic = sc.nextDouble();
        sc.nextLine();
    }

    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    void display() {
        System.out.println("Name: " + Ename);
        System.out.println("ID: " + Eid);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        EMPLOYEE[] e = new EMPLOYEE[n];

        for (int i = 0; i < n; i++) {
            e[i] = new EMPLOYEE();
            e[i].read(sc);
            e[i].compute_net_sal();
        }

        for (int i = 0; i < n; i++)
            e[i].display();

        sc.close();
    }
}
