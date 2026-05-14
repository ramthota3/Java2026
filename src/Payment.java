public class Payment {
    void loanType(){
        System.out.println("Loan Information");
    }
}
class PersonalLoan extends Payment{
    @Override
    void loanType() {
        System.out.println("Personal Loan Interest : 6%");
    }
}
class HomeLoan extends Payment{
    @Override
    void loanType() {
        System.out.println("Home loan Interest : 4%");
    }
}
class PaymentDemo{
    public static void main(String[] args){
        Payment p1 = new PersonalLoan();
        p1.loanType();
        Payment p2 = new HomeLoan();
        p2.loanType();
    }
}
