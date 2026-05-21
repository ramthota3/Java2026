public class Transaction {
    void pay(double amount){
        System.out.println("Transaction processing");
    }
}
class UpiPayment extends Transaction{
    @Override
    void pay(double amount) {
        System.out.println("Transaction was made using Upi :" + amount);
    }
}
class CardPayment extends Transaction{
    @Override
    void pay(double amount) {
        System.out.println("Transaction was made using Card :" + amount);
    }
}
  class TransactionDemo{
    public static void main(String[] args){
        Transaction t1 = new UpiPayment();
        t1.pay(30000);

        Transaction t2 = new CardPayment();
        t2.pay(49000);
    }
}
