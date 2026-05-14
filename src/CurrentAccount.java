 class CurrentAccount extends Account {
    CurrentAccount(String name, double balance){
     super(name, balance);
    }

     @Override
     void interest() {
         double interest = balance * 0.02;
         System.out.println("Current Interest :" + interest);
     }
 }
