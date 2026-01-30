/*4. Write a Java program to display non diagonal elements and find their sum. 
[Hint: Non Principal diagonal: The diagonal of a diagonal matrix from the top 
right to the bottom left corner is called non principal diagonal.]  */
import java.util.Scanner;

public class Qn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int sum = 0;
        
        System.out.print("Enter " + n*n + " Elements :");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Non-principal diagonal elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - i - 1] + " ");
            sum += a[i][n - i - 1];
        }

        System.out.println("\nSum = " + sum);

        sc.close();
    }
}
