/**
 * This class models a savings account and is a subclass of Account
 * 
 * @author Krish Thawani
 */

public class SavingsAccount extends Account {

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate, Date dateCreated) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = dateCreated;
    }

    // Override abstract withdraw method
    public void withdraw(double money) {
        if (money > balance) {
            System.out.printf("Savings Requested Withdrawal: $%,.2f\n", money);
            System.out.printf("Savings Account Balance: $%,.2f\n", balance);
            System.out.println("ERROR: Savings Account cannot be overdrawn.");

        } else {
            balance -= money;
            System.out.printf("Savings Successful Withdrawal of: $%,.2f\n", money);
            System.out.printf("New Savings Account Balance: $%,.2f\n", balance);

        }
        System.out.println();
    }
}