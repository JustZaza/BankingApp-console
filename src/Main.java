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


        System.out.print("1: Deposit money into account.\n2: Withdraw money from account\n3: View Balance.\n\n>>>");
        int optionSelected = sc.nextInt();
        options(optionSelected);
    }
    
    static void options(int selected){
        switch (selected){
            case 1:
                System.out.println(bank.getDeposit());
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();

                if (bank.getBalance() < 0){
                    System.out.println("Insufficient Funds!");
                } else {
                    System.out.println("Withdrawal Successful!");
                    double total = bank.getBalance() - withdraw;
                    bank.setBalance(total);
                }

            case 3:
                System.out.println(bank.getAccountHolder());
                System.out.println(bank.getAccountNumber());
                System.out.println(bank.getBalance());

        }
        
    }
}

//For the withdrawal case, i want it to subtract the money withdrew from the balance. And then when viewing the balance again, it should be subtracted.