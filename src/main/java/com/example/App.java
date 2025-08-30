package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double balance;
        boolean isRunning = true;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM MACHINE");
        System.out.println("***********************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("***********************");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

        scanner.close();
    }
}
