/**
 * This class models a checking account and is a subclass of Account
 * 
 * @author Krish Thawani
 */

public class CheckingAccount extends Account {

    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double interestRate, Date dateCreated,
            double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
        this.overdraftLimit = overdraftLimit;
    }

    // Override abstract withdraw method
    public void withdraw(double money) {
        if (money > (balance + overdraftLimit)) {
            System.out.printf("Checking Requested Withdrawal: $%,.2f\n", money);
            System.out.printf("Overdraft Limit: $%,.2f\n", overdraftLimit);
            System.out.printf("Checking Account Balance: $%,.2f\n", balance);
            System.out.println("ERROR: Checking Account cannot be overdrawn past overdraft limit.");

        } else {
            balance -= money;
            System.out.printf("Checking Successful Withdrawal of: $%,.2f\n", money);
            System.out.printf("New Checking Account Balance: $%,.2f\n", balance);
        }
        System.out.println();
    }
}