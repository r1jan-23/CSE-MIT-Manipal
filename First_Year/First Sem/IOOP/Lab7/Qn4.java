/*4. Create an Account class that stores customers name, acc-no and type of account. 
From this derive class current account and savings bank account. Include necessary 
methods to achieve following tasks 
i) Accept the deposit from a customer and update the balance 
ii) Display the balance 
iii) Compute and deposit interest 
iv) Permit withdraw and update the balance 
v) Check for minimum balance impose penalty if necessary and update the balance 
For savings bank account, the facilities provided include computing interest and 
withdrawal. No interest can be computed on current bank account and a minimum 
balance must always be maintained. In any instance when it goes below this level, 
service tax must be imposed.  */
import java.util.Scanner;

class Account {
    protected String name;
    protected int accNo;
    protected String accType;
    protected double balance;

    Account(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void computeInterest() {
    }

    void checkMinimumBalance() {
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;

    SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, "Savings", balance);
    }

    @Override
    void computeInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
    }
}

class CurrentAccount extends Account {
    private static final double MIN_BALANCE = 5000;
    private static final double PENALTY = 200;

    CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, "Current", balance);
    }

    @Override
    void computeInterest() {
        System.out.println("No interest for Current Account");
    }

    @Override
    void checkMinimumBalance() {
        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("Minimum balance not maintained. Penalty imposed.");
        }
    }
}

public class Qn4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Savings Account Holder Name:");
        String sName = sc.nextLine();
        System.out.println("Enter Account Number:");
        int sAcc = sc.nextInt();
        System.out.println("Enter Initial Balance:");
        double sBal = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(sName, sAcc, sBal);

        System.out.println("Enter deposit amount:");
        sa.deposit(sc.nextDouble());

        System.out.println("Enter withdrawal amount:");
        sa.withdraw(sc.nextDouble());

        sa.computeInterest();
        sa.displayBalance();

        System.out.println();

        sc.nextLine();
        System.out.println("Enter Current Account Holder Name:");
        String cName = sc.nextLine();
        System.out.println("Enter Account Number:");
        int cAcc = sc.nextInt();
        System.out.println("Enter Initial Balance:");
        double cBal = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(cName, cAcc, cBal);

        System.out.println("Enter deposit amount:");
        ca.deposit(sc.nextDouble());

        System.out.println("Enter withdrawal amount:");
        ca.withdraw(sc.nextDouble());

        ca.checkMinimumBalance();
        ca.displayBalance();

        sc.close();
    }
}
