package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);
        Bank bankAccount;

        jumpLine();
        System.out.println("\tWelcome to the Java Bank");
        jumpLine();

        System.out.print("Name of account holder: ");
        String accountHolder = scan.nextLine();
        System.out.print("Number of account: ");
        int accountNumber = scan.nextInt();

        System.out.print("Would you like to do a first deposit [Y/N]: ");
        char userFirstDeposit = scan.next().charAt(0);
        if (userFirstDeposit == 'y' || userFirstDeposit == 'Y'){
            System.out.print("\nEnter the amount of the first deposit: ");
            bankAccount = new Bank(accountHolder, accountNumber, scan.nextDouble());
        } else {
            bankAccount = new Bank(accountHolder, accountNumber);
        }

        System.out.println("\n" + bankAccount);

        jumpLine();

        System.out.print("Deposit: $");
        bankAccount.deposit(scan.nextDouble());

        System.out.printf("You balance has been updated: $%.2f \n", bankAccount.getAccountBalance());

        jumpLine();

        System.out.print("Withdrawal: $");
        bankAccount.withdraw(scan.nextDouble());

        System.out.printf("You balance has been updated: $%.2f \n", bankAccount.getAccountBalance());
        scan.close();
    }

    public static void jumpLine(){
        System.out.println("\n====================================\n");
    }
}
