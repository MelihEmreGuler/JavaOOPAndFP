package ch6.account.ex;

public class InsufficentBalanceException extends Exception {
    public InsufficentBalanceException(String action, double balance, double amount) {
        super(action + " Insufficient Balance: " + balance + " amount: " + amount);
    }

    public InsufficentBalanceException(double balance, double amount) {
        super(" Insufficient Balance: " + balance + " amount: " + amount);
    }
}
