public class Main {
    public static void main(String[] args) {
//        String studentName = "Ram";
//        int studentId = 3;
//        int studentAge = 27;
//        float studentFee = 75.25f;
//        char studentGrade = 'A';
//        char studentGrades = 'B';
//
//
//        System.out.println("Student name: "+ studentName);
//        System.out.println("Student id: "+ studentId);
//        System.out.println("Student age: "+ studentAge);
//        System.out.println("Student fee: "+ studentFee);
//        System.out.println("Student grade:"+ studentGrade);
//        System.out.println("Student grades:"+ studentGrades);

//   ARTHIMETIC OPERATORS
//        int a = 4;
//        int b = 6;
//
//        System.out.println("Addtion: " + (a+b));
//        System.out.println("Subtraction: " + (a-b));
//        System.out.println("Multiplication: "+ (a*b));
//        System.out.println("Division: "+ (a/b));
//        System.out.println("modulus: "+ (a%b));



//  RELATIONAL OPERATORS

//        int a = 11;
//        int b = 5;
//
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a > b: " + (a > b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a >= b:" + (a >= b));
//        System.out.println("a == b:" + (a == b));
//        System.out.println("a != b:" + (a != b));


//   LOGICAL OPERATORS

//        boolean a = true;
//        boolean b = false;
//
//        System.out.println("a && b  :" + (a && b));
//        System.out.println("a || b  :" + (a || b));
//        System.out.println("!a :" + (!a));


//  TERNARY OPERATOR

//        int a = 15;
//        int b = 25;
//
//        int max = (a > b) ? a : b;
//        System.out.println("Maximum value is: " + max);


//        calculating the interest

//      int principalAmount = 500000;
//
//      double rateOfInterest = 3;
//      double tenure = 3;
//
//      double simpleInterest = (principalAmount * rateOfInterest * tenure) / 100;
//      System.out.println(" Simple Interest :" + simpleInterest);



// compound interest


        int principalAmount = 300000;

        double rateOfInterest = 0.08;

        int tenure = 5;

        int n = 12;

        double amount = principalAmount * Math.pow(1+(rateOfInterest/n),n*tenure);
        double interest = amount - principalAmount;

        System.out.println("Compound Interest after " + tenure + "years:" + interest);
        System.out.println("Total Amount:" + amount );
    }
    }
