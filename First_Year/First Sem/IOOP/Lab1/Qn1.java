/*1. Write a Java program to accept the number of hours worked, hourly rate and calculates 
the salary for an employee according to the following criteria: The company pays 
straight time for the first 40 hours worked by each employee and time and a half for 
all hours worked in excess of 40 hours.*/
import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hoursWorked, hourlyRate, salary;

        System.out.print("Enter number of hours worked: ");
        hoursWorked = sc.nextDouble();

        System.out.print("Enter hourly rate: ");
        hourlyRate = sc.nextDouble();

        if (hoursWorked <= 40) {
            salary = hoursWorked * hourlyRate;
        } else {
            salary = (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
        System.out.println("Total Salary = " + salary);

        sc.close();
    }
}
 