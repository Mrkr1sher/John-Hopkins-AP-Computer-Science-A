/**
 * This program tests the SavingsAccount and CheckingAccount subclasses of the
 * abstract Account class.
 * 
 * @author Krish Thawani
 */

public class TestAccount {
    public static void main(String[] args) {

        System.out.println("\n");

        Date dateCreated = new Date(5, 5, 2005);
        SavingsAccount savings = new SavingsAccount("5632", 500, 2.3, dateCreated); // Savings - $500
        CheckingAccount checking = new CheckingAccount("2365", 1000, 2.15, dateCreated, 100); // Checking - $1000

        savings.deposit(630.50); // Savings = $1130.50
        checking.deposit(214.30); // Checking = $1214.30

        savings.withdraw(1300); // Savings = $1130.50, Did not process
        checking.withdraw(1300); // Checking = -$85.70

        savings.deposit(199.50); // Savings = $1330
        checking.deposit(200.70); // Checking = $115

        savings.withdraw(1300); // Savings = $30
        checking.withdraw(300); // Checking = $115, Did not process

    }
}