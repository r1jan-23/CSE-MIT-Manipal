/*2. Write a java program to add two numbers using the bitwise operator and check if the 
output is an even or odd number. [Hint: use left shift and right shift bitwise operators].   */
import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        int sum = a;

        System.out.println(sum);

        if ((sum & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        sc.close();
    }
}
