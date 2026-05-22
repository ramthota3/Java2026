public interface Itransaction {
    public void deposit(double amount) throws InvalidAmountException;
    public void withdraw(double amount) throws  InvalidAmountException;
    public double getBalance();
}
