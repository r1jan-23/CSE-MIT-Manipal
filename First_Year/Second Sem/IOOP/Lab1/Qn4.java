/*4. Write a Java program to rotate the elements of an array to the right/left  by a given 
number of steps. The program should handle arrays of different sizes and should be 
able to rotate the array in both directions (left and right).  */
import java.util.Scanner;

public class Qn4 {
    static void rotateLeft(int[] arr, int n, int k) {
        k = k % n;
        int[] temp = new int[n];
        int idx = 0;

        for (int i = k; i < n; i++)
            temp[idx++] = arr[i];

        for (int i = 0; i < k; i++)
            temp[idx++] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    static void rotateRight(int[] arr, int n, int k) {
        k = k % n;
        int[] temp = new int[n];
        int idx = 0;

        for (int i = n - k; i < n; i++)
            temp[idx++] = arr[i];

        for (int i = 0; i < n - k; i++)
            temp[idx++] = arr[i];

        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter number of steps: ");
        int k = sc.nextInt();

        System.out.print("Enter choice (1-Left, 2-Right): ");
        int choice = sc.nextInt();

        if (choice == 1)
            rotateLeft(arr, n, k);
        else
            rotateRight(arr, n, k);

        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        sc.close();
    }
}
