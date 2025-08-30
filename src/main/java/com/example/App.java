package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double balance;
        boolean isRunning = true;
        int choice;

        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("***********************");
            System.out.println("ATM MACHINE");
            System.out.println("***********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***********************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("SHOW BALANCE");
                case 2 -> System.out.println("DEPOSIT");
                case 3 -> System.out.println("WITHDRAW");
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        scanner.close();
    }
}
