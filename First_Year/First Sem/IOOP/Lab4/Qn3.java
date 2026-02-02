/*3. Define a class to represent a Bank account. Include the following members. 
Data members: 
a. Name of the depositor 
b. Account number. 
c. Type of account. 
d. Balance amount in the account. 
e. Rate of interest (static data) 
Provide a default constructor and parameterized constructor to this class. Also 
provide Methods: 
a. To deposit amount. 
55 
b. To withdraw amount after checking for minimum balance. 
c. To display all the details of an account holder. 
d. Display rate of interest (a static method) 
Illustrate all the constructors as well as all the methods by defining objects. */
class BankAccount {
    String depositorName;
    int accountNumber;
    String accountType;
    double balance;

    static double rateOfInterest = 6.5; 

    BankAccount() {
        depositorName = "Unknown";
        accountNumber = 0;
        accountType = "Savings";
        balance = 0.0;
    }

    BankAccount(String name, int accNo, String type, double balance) {
        this.depositorName = name;
        this.accountNumber = accNo;
        this.accountType = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance! Minimum balance must be 1000.");
        }
    }

    void display() {
        System.out.println("Name: " + depositorName);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void displayInterestRate() {
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

public class Qn3 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("Rijan", 12345, "Savings", 5000);

        a1.display();
        a2.display();

        a2.deposit(2000);
        a2.withdraw(3000);
        a2.display();

        BankAccount.displayInterestRate();
    }
}
