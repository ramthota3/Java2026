public class AccountDemo {
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount("Ram", 99999);
        s.display();
        s.interest();

        System.out.println();

        CurrentAccount c = new CurrentAccount("Sonu", 738000);
        c.display();
        c.interest();
    }
}
