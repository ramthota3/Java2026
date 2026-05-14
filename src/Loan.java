public class Loan {
    double principalAmount;
    double rateOfInterest;
    int tenure;

    Loan(double principalAmount, double rateOfInterest,int tenure){
        this.principalAmount = principalAmount;
        this.rateOfInterest = rateOfInterest;
        this.tenure = tenure;
    }
    void calculateInterest(){
        System.out.println("Loan Interest");
    }
}
class CarLoan extends Loan {
    CarLoan(double principalAmount,double rateOfInterest, int tenure){
        super(principalAmount,rateOfInterest,tenure);
    }

    @Override
    void calculateInterest() {
        double simpleInterest = (principalAmount*rateOfInterest*tenure)/100;

        System.out.println("CarLoan");
        System.out.println("Principal Amount :" + principalAmount);
        System.out.println("Rate of Interest :" + rateOfInterest);
        System.out.println("Tenure :" + tenure);
        System.out.println("SimpleInterest : " + simpleInterest);

    }
}

class EducationLoan extends Loan{
    EducationLoan(double principalAmount, double rateOfInterest , int tenure){
        super(principalAmount,rateOfInterest,tenure);
    }

    @Override
    void calculateInterest() {
        double simpleInterest = (principalAmount*rateOfInterest*tenure)/100;
        System.out.println("EducationLoan");
        System.out.println("Principal Amount :" + principalAmount);
        System.out.println("Rate of Interest : "+ rateOfInterest);
        System.out.println("Tenure :" + tenure);
        System.out.println("SimpleInterest : " + simpleInterest);

    }
}

     class LoanDemo {

    public static void main(String[] args) {

        Loan l1 = new CarLoan(500000, 8, 2);
        l1.calculateInterest();

        System.out.println();

        Loan l2 = new EducationLoan(200000, 5, 3);
        l2.calculateInterest();
    }
}













