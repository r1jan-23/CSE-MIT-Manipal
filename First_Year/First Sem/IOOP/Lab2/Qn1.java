/*1. A Taxi service offers a new service based on travel distance. Write a Java 
program to calculate the total distance traveled by considering the following 
charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR 
5/km. */

import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled (km): ");
        int km = sc.nextInt();
        int fare = 0;

        if (km <= 5)
            fare = km * 10;
        else if (km <= 20)
            fare = (5 * 10) + (km - 5) * 8;
        else
            fare = (5 * 10) + (15 * 8) + (km - 20) * 5;

        System.out.println("Total Fare = " + fare);

        sc.close();
    }
}
