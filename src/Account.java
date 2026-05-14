public class Account {
    String name;
    double balance;
    Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    void display(){
        System.out.println("Name :" + name);
        System.out.println(("Balance :" + balance));
    }
    void interest(){
        System.out.println("Calculating Interest");
    }
}
