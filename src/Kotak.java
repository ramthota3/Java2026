public class Kotak implements Itransaction{
    private double balance;
    public Kotak(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException{
        if (amount <= 0){
            throw new InvalidAmountException("Kotak Invalid deposit amount");
        }
        if (amount > 0){
            balance += amount;
            System.out.println("Kotak Deposited: " + amount);
        }else {
            System.out.println("Kotak Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0){
            throw new InvalidAmountException("Kotak Invalid withdrawl amount");
        }
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(" Kotak Withdraw: "+ amount);
        }else {
            System.out.println("Kotak Invalid withdrawl amount");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("Kotak Current Balance: " + balance);
        return balance;
    }
}
