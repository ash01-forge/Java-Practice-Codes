package Pack5;

import java.util.Scanner;

public class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double amount) {
        if (amount < balance)
            balance -= amount;
        else System.out.println("Insufficient funds!!");
        return balance;
    }

    void displayBalance() {
        System.out.println("Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount[] b = new BankAccount[2];
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter the account holder number:");
            String accountNumber = sc.nextLine();
            System.out.println("Enter the account holder name:");
            String holderName = sc.nextLine();
            System.out.println("Enter the balance of account holder:");
            double balance = sc.nextDouble();
            b[i] = new BankAccount(accountNumber, holderName, balance);
            System.out.println("Enter the amount you want to deposit:");
            b[i].deposit(sc.nextDouble());
            sc.nextLine();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("Enter the amount you want to withdraw:");
            b[i].withdraw(sc.nextDouble());
        }
        for (int i = 0; i < b.length; i++) {
            b[i].displayBalance();
        }
    }
}
