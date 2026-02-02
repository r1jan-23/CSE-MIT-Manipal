/*3. Implement a ShoppingCart class that contains an inner class Item. 
a) The Item class should have fields like itemName, quantity, and price. 
b) The ShoppingCart class should provide methods to add items, calculate the total price, 
and display the cart contents.  */
import java.util.Scanner;

class ShoppingCart {
    Item[] items;
    int count;

    class Item {
        String itemName;
        int quantity;
        double price;

        Item(String name, int qty, double price) {
            this.itemName = name;
            this.quantity = qty;
            this.price = price;
        }

        double total() {
            return quantity * price;
        }

        void display() {
            System.out.println(itemName + " | Qty: " + quantity + " | Price: " + price);
        }
    }

    ShoppingCart(int n) {
        items = new Item[n];
        count = 0;
    }

    void addItem(String name, int qty, double price) {
        items[count++] = new Item(name, qty, price);
    }

    void displayCart() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            items[i].display();
            sum += items[i].total();
        }
        System.out.println("Total Price: " + sum);
    }
}

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of items: ");
        int n = sc.nextInt();
        sc.nextLine();

        ShoppingCart cart = new ShoppingCart(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Item Name: ");
            String name = sc.nextLine();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            cart.addItem(name, qty, price);
        }

        cart.displayCart();
    }
}
