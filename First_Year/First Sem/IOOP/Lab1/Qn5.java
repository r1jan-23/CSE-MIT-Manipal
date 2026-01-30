/*5. Write a Java program to manage stock information for multiple products. The program 
should store the product name, product price, and quantity in separate one
dimensional arrays for n items. The user should be able to specify which products they 
want to purchase and the desired quantity for each. Based on the user’s input, the 
program should generate and display the total bill.  */

import java.util.Scanner;

public class Qn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] productName = new String[n];
        double[] price = new double[n];
        int[] stockQty = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            productName[i] = sc.nextLine();

            System.out.print("Enter product price: ");
            price[i] = sc.nextDouble();

            System.out.print("Enter available quantity: ");
            stockQty[i] = sc.nextInt();
            sc.nextLine();
        }

        double totalBill = 0;

        System.out.print("Enter number of products to purchase: ");
        int items = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < items; i++) {
            System.out.print("Enter product name to purchase: ");
            String pname = sc.nextLine();

            System.out.print("Enter quantity to purchase: ");
            int qty = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < n; j++) {
                if (productName[j].equalsIgnoreCase(pname) && qty <= stockQty[j]) {
                    totalBill += price[j] * qty;
                    stockQty[j] -= qty;
                }
            }
        }

        System.out.println("Total Bill Amount: " + totalBill);

        sc.close();
    }
}
