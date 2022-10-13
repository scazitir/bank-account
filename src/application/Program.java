package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("\tWelcome to the Java Bank");
        System.out.println("====================================");

        System.out.print("Name of account holder: ");
        String accountHolder = scan.nextLine();
        System.out.print("Number of account: ");
        int accountNumber = scan.nextInt();
        System.out.print("Enter the amount of the first deposit: ");
        double firstDeposit = scan.nextDouble();

        Bank bankAccount = new Bank(accountHolder, accountNumber, firstDeposit);

        System.out.println(bankAccount);
        scan.close();
    }
}
