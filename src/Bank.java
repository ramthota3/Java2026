public class Bank {
    public void rateOfInterest () {
        System.out.println("Bank gives interest");
    }
}
class Hdfc extends Bank{
    void loan(){
        System.out.println(" Hdfc provides loan");
    }
}
class Hsbc extends Bank{
    void loan (){
        System.out.println(" Hsbc provides loan");
    }
}
class Idbi extends Bank{
    void loan (){
        System.out.println(" Idbi provides loan");
    }
}
    class Main {
    public static void main(String[] args){
        Hdfc a = new Hdfc();
        Hsbc b = new Hsbc();
        Idbi c = new Idbi();

        a.rateOfInterest();
        a.loan();
        b.rateOfInterest();
        b.loan();
        c.rateOfInterest();
        c.loan();

    }
}
