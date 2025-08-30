package com.example;

import java.util.Scanner;

/**
 * Simple ATM simulation that allows the user to:
 * - Check balance
 * - Deposit money
 * - Withdraw money
 * - Exit the program
 */
public class App {
    // Scanner for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;            // Initial account balance
        boolean isRunning = true;     // Main loop control flag
        int choice;

        // Main ATM loop
        while (isRunning) {
            // Display menu
            System.out.println("-----------------------");
            System.out.println("ATM MACHINE");
            System.out.println("-----------------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("-----------------------");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();  // Read user's choice

            // Handle user's selection
            switch (choice) {
                case 1 -> showBalance(balance);           // Show current balance
                case 2 -> balance += deposit();          // Add deposit to balance
                case 3 -> balance -= withdraw(balance);  // Subtract withdrawal from balance
                case 4 -> isRunning = false;            // Exit the program
                default -> System.out.println("INVALID CHOICE");   // Invalid input handling
            }
        }

        // Exit message
        System.out.println("-----------------------");
        System.out.println("Thank you! Have a nice day!");

        scanner.close();  // Close the scanner to release resources
    }

    /**
     * Displays the current account balance.
     *
     * @param balance The user's current account balance
     */
    static void showBalance(double balance) {
        System.out.println("-----------------------");
        System.out.printf("$%.2f\n", balance);
    }
    /**
     * Handles deposit input from the user.
     * Validates that the entered amount is not negative.
     *
     * @return The deposit amount (returns 0 if invalid)
     */
    static double deposit() {
        double amount;
        System.out.println("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
    /**
     * Handles withdrawal input from the user.
     * Checks if the user has sufficient funds and if the amount is valid.
     *
     * @param balance The user's current account balance
     * @return The withdrawal amount (returns 0 if invalid or insufficient funds)
     */
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }
}
