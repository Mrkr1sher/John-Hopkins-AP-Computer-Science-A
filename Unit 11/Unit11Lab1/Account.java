/**
 * This abstract class models an account and is a superclass for
 * savings/checking accounts.
 * 
 * @author Krish Thawani
 */
public abstract class Account {

    protected String accountNumber;
    protected double balance;
    protected double interestRate;
    protected Date dateCreated;

    // Concrete deposit method
    public void deposit(double money) {
        balance += money;
        System.out.printf("Successful Deposit of: $%,.2f\n", money);
        System.out.printf("New Account Balance: $%,.2f\n", balance);
        System.out.println();
    }

    // Abstract withdraw method
    public abstract void withdraw(double money);

}