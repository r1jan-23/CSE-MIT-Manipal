/*1. Write a menu driven program to do the following 
i. 
To check whether a string is palindrome or not 
ii. Write the string in an alphabetical order 
iii. Reverse the string 
iv. Concatenate the original string and the reversed string */
import java.util.Scanner;
import java.util.Arrays;

public class Qn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Check Palindrome");
            System.out.println("2. Alphabetical Order");
            System.out.println("3. Reverse the String");
            System.out.println("4. Concatenate Original and Reversed String");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String rev = new StringBuilder(str).reverse().toString();
                    if (str.equals(rev))
                        System.out.println("Palindrome");
                    else
                        System.out.println("Not a Palindrome");
                    break;

                case 2:
                    char[] ch = str.toCharArray();
                    Arrays.sort(ch);
                    System.out.println("Alphabetical Order: " + new String(ch));
                    break;

                case 3:
                    System.out.println("Reversed String: " +
                            new StringBuilder(str).reverse());
                    break;

                case 4:
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println("Concatenated String: " + str + reversed);
                    break;

                case 5:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 5);
    }
}
