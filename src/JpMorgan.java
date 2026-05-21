public class JpMorgan implements Itransaction{
    private double balance;
    public JpMorgan(double initialBalance){
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("JpMorgan Deposited: " + amount);
        }else {
            System.out.println("JpMorgan Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(" JpMorgan Withdraw: "+ amount);
        }else {
            System.out.println("JpMorgan Invalid withdrawl amount");
        }
    }

    @Override
    public double getBalance() {
        System.out.println("JpMorgan Current Balance: " + balance);
        return balance;
    }
}

