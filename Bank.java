import java.util.Scanner;
class Account {
    protected String customerName;
    protected String accountNumber;
    protected double balance;
    protected String accountType;

    public Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount. Current balance: $" + balance);
        }
    }

    public void displayAccountDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: $" + balance);
    }
}

class CurrAcct extends Account {
    public CurrAcct(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Current Account");
    }
}

class SavAcct extends Account {
    public SavAcct(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Savings Account");
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name for current account: ");
        String currentName = scanner.nextLine();
        System.out.print("Enter account number for current account: ");
        String currentAccNum = scanner.nextLine();
        CurrAcct currentAccount = new CurrAcct(currentName, currentAccNum);
        System.out.print("Enter customer name for savings account: ");
        String savingsName = scanner.nextLine();
        System.out.print("Enter account number for savings account: ");
        String savingsAccNum = scanner.nextLine();
        SavAcct savingsAccount = new SavAcct(savingsName, savingsAccNum);
        System.out.println("\nChoose operation for Current Account:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter choice (1/2): ");
        int choice = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if (choice == 1) {
            currentAccount.deposit(amount);
        } else if (choice == 2) {
            currentAccount.withdraw(amount);
        } else {
            System.out.println("Invalid choice.");
        }
        System.out.println("\nChoose operation for Savings Account:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter choice (1/2): ");
        choice = scanner.nextInt();
        System.out.print("Enter amount: ");
        amount = scanner.nextDouble();
        if (choice == 1) {
            savingsAccount.deposit(amount);
        } else if (choice == 2) {
            savingsAccount.withdraw(amount);
        } else {
            System.out.println("Invalid choice.");
        }
        System.out.println("\nCurrent Account Details:");
        currentAccount.displayAccountDetails();
        System.out.println("\nSavings Account Details:");
        savingsAccount.displayAccountDetails();
    }
}
