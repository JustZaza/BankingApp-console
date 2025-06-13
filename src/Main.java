/*
* Create BankAccount class
* Give it fields like:
    -accountNumber,
    -accountHolder,
    -balance.

* Implement methods to:
    -Deposit money.
    -Withdraw money (only if balance is sufficient).
    -Show account details.

*In your main method:
    -Create one bank account object.
    -Allow the user (via Scanner) to choose actions: deposit, withdraw, view balance.
    -Repeat until the user chooses to exit.
* */

import java.util.Scanner;

public class Main {
    static BankAccount bank = new BankAccount();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;
        System.out.println("Hello Banker. How can we help you today?");

        System.out.println("Please enter account details:");
        System.out.println("Account Holder name: ");
        String name = sc.nextLine();
        bank.setAccountHolder(name);

        System.out.println("Account Number: ");
        String accountNumber = sc.nextLine();
        bank.setAccountNumber(accountNumber);

        System.out.println("Balance: ");
        double balance = sc.nextDouble();
        bank.setBalance(balance);
        options();
    }
    
    static void options() {
        boolean running = true;
        while (running) {
            System.out.print("1: Deposit money into account.\n2: Withdraw money from account\n3: View Balance.\n4: Exit\n\n>>>");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: \nR");
                    bank.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: \nR");
                    bank.withdraw(sc.nextDouble());
                    break;
                case 3:
                    bank.viewDetails();
                    break;
                case 4:
                    System.out.println("Thank you for using our bank.");
                    running = false;
                    break;
//                    System.out.println("Do you want to do another transaction? Y/N");
//                    String answer = sc.nextLine();
//                    if (answer.equalsIgnoreCase("y")) {
//                        running = true;
//                    } else {
//                        running = false;
//                    }

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}