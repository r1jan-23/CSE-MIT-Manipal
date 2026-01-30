/*5. Write a Java programs to print factorial of a given no recursively.  */
import java.util.Scanner;

public class Qn5 {
    static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for factorial : ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + fact(n));

        sc.close();
    }
}
