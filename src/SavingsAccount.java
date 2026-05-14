class SavingsAccount extends  Account{
    SavingsAccount (String name ,double balance) {
     super(name, balance);

    }
    void interest(){
        double interest = balance * 0.05;
        System.out.println("Savings Interest :" + interest);
    }
}
