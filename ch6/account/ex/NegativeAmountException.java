package ch6.account.ex;

public class NegativeAmountException extends Exception{
    private static final String prefix = "Negative amount can't be provided. Amount: ";
    public NegativeAmountException(double amount){
        super(prefix + amount);
    }
    public String getMessage(){
        return prefix + super.getMessage();
    }
}
