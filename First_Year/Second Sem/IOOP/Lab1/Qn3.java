/*3. Write a Java program to execute the following statements. Observe and analyze the 
outputs. 
a. int x =10;            
c. double x=10.5; 
double y = x;            
int y = (int) x 
System.out.println(y);           
System.out.println(y); 
 */

import java.util.Scanner;

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int x1 = sc.nextInt();
        double y1 = x1;
        System.out.println(y1);

        System.out.print("Enter Number 2: ");
        double x2 = sc.nextDouble();
        int y2 = (int) x2;
        System.out.println(y2);

        sc.close();
    }
}

