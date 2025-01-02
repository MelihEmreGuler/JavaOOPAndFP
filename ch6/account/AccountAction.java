package ch6.account;

import ch6.account.ex.InsufficentBalanceException;

public interface AccountAction {
    double act(double balance, double amount) throws InsufficentBalanceException;
}
