package entities;

public class Bank {

    private final double WITHDRAWAL_TAX = 5.00;
    private String accountHolder;
    private int accountNumber;
    private double accountBalance;

    public Bank(String accountHolder, int accountNumber, double accountBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        deposit(accountBalance);
    }

    public Bank(String accountHolder, int accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // If any user needs to change the name in the future, the program will have an option to do that.
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void withdraw(double amount){
        if (amount < 0){
            System.err.println("Please inform an amount greater than $0.00");
        } else {
            this.accountBalance -= (amount + WITHDRAWAL_TAX);
        }
    }

    public void deposit(double amount){
        if (amount < 0){
            System.err.println("Please inform an amount greater than $0.00");
        } else {
            this.accountBalance += amount;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append(this.accountHolder);
        sb.append(". (");
        sb.append(this.accountNumber);
        sb.append(")");
        sb.append(" Balance $");
        sb.append(String.format("%.2f", this.accountBalance));

        return sb.toString();
    }
}
