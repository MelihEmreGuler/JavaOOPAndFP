package ch6.account;

import ch6.account.ex.InsufficentBalanceException;

public class Withdraw implements AccountAction{

    @Override
    public double act(double balance, double amount) throws InsufficentBalanceException{
        if (balance >= amount)
            balance -= amount;
        else
            throw new InsufficentBalanceException("Withdraw", balance, amount);
        return balance;
    }
}
