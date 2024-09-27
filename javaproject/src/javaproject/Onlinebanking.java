

package javaproject;

import java.util.HashMap;
import java.util.Scanner;

public class Onlinebanking {
    private static HashMap<String, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Online Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    viewAccount();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    withdrawMoney();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting Online Banking System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        String accountId = "ACC" + (accounts.size() + 1);
        accounts.put(accountId, new Account(name, accountId, initialDeposit));
        System.out.println("Account created successfully! Account ID: " + accountId);
    }

    private static void viewAccount() {
        System.out.print("Enter your account ID: ");
        String accountId = scanner.nextLine();
        if (accounts.containsKey(accountId)) {
            System.out.println(accounts.get(accountId));
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void depositMoney() {
        System.out.print("Enter your account ID: ");
        String accountId = scanner.nextLine();
        if (accounts.containsKey(accountId)) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            accounts.get(accountId).deposit(amount);
            System.out.println("Deposit successful! New balance: $" + accounts.get(accountId).getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney() {
        System.out.print("Enter your account ID: ");
        String accountId = scanner.nextLine();
        if (accounts.containsKey(accountId)) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            if (accounts.get(accountId).withdraw(amount)) {
                System.out.println("Withdrawal successful! New balance: $" + accounts.get(accountId).getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }
}

// Helper class for account information
class Account {
    private String holderName;
    private String accountId;
    private double balance;

    public Account(String holderName, String accountId, double balance) {
        this.holderName = holderName;
        this.accountId = accountId;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account ID: " + accountId + ", Account Holder: " + holderName + ", Balance: $" + balance;
    }
}
