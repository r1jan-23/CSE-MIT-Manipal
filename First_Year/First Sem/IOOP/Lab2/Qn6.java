/*6. Write a Java program to compute the electricity bill for an industry using a 
switch-case statement. The program should take the daily consumption in units 
for 7 days as input. Based on the total consumption, the program should 
calculate and display the total electricity bill according to the following pricing 
table: 
Units          Price per Unit (INR) 
0 - 100       7.00  
101 - 200     8.00 
>= 201        10.00   */

import java.util.Scanner;

public class Qn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalUnits = 0;

        System.out.println("Enter daily consumption for 7 days:");
        for (int i = 0; i < 7; i++)
            totalUnits += sc.nextInt();

        double bill = 0;

        switch (totalUnits / 100) {
            case 0:
                bill = totalUnits * 7;
                break;
            case 1:
            case 2:
                bill = totalUnits * 8;
                break;
            default:
                bill = totalUnits * 10;
        }

        System.out.println("Total Units = " + totalUnits);
        System.out.println("Total Bill = " + bill);

        sc.close();
    }
}

