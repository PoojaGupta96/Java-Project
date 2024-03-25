import java.util.Scanner;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " is successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " is successful.");
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class Bank {
    private Account[] accounts;
    private int numAccounts;

    public Bank(int capacity) {
        accounts = new Account[capacity];
        numAccounts = 0;
    }

    public void addAccount(String accountNumber, double initialBalance) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = new Account(accountNumber, initialBalance);
            numAccounts++;
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Cannot add more accounts. Bank is full.");
        }
    }

    public Account findAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(10); // Bank with a capacity of 10 accounts

        while (true) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    bank.addAccount(accountNumber, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    Account account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    account = bank.findAccount(accountNumber);
                    if (account != null) {
                        System.out.println("Balance: $" + account.getBalance());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
