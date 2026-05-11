import java.util.Scanner;

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


//        int principalAmount = 300000;
//
//        double rateOfInterest = 0.08;
//
//        int tenure = 5;
//
//        int n = 12;
//
//        double amount = principalAmount * Math.pow(1+(rateOfInterest/n),n*tenure);
//        double interest = amount - principalAmount;
//
//        System.out.println("Compound Interest after " + tenure + "years:" + interest);
//        System.out.println("Total Amount:" + amount );


//   Area of circle

//     int radius = 6;
//
//     double pi = 3.14;
//
//     double area = pi * radius * radius;
//
//     System.out.println(" Area of circle:" + area);

//  Average of three

//     int  num1 = 10,num2 = 20,num3 = 30;
//
//     int average = (num1 + num2 + num3)/3;
//
//     System.out.println("Average: " +
//

//   MAXIMUM OF TWO NUMBERS

//     int a = 30;
//
//     int b = 50;
//
//     int max = Math.max(a,b);
//
//      System.out.println("Maximum number is :"+ max);

//   SWAPPING OF TWO NUMBERS
//
//        int a = 7;
//        int b = 9;
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//   EVEN OR ODD

//      int n = 20;
//      if (n%2 == 0)
//        System.out.println(n + " is Even");
//      else
//        System.out.println(n + " is Odd");


//   check if div by 2 & 3

//     int n =  10;
//
//     if (n % 2 == 0  && n % 3 == 0)
//         System.out.println(n + "is divisible by both 2 and 3");
//     else
//         System.out.println(n + "is not divisible by both 2 and 3 ");

// check if div by 3 or 7

//        int n = 14;
//
//        if(n%3 == 0 || n%7 == 0)
//
//            System.out.println(n + "is divisble by 3 or 7");
//        else
//            System.out.println(n + "is not divisible 3 or 7");
//

//  check if div by 2 but not 5

//      int n = 10;
//
//      if(n % 2 == 0 && n % 5 !=0)
//
//          System.out.println(n + "is divisible by 2 but not by 5");
//      else
//          System.out.println(n + " is either not divisible by 2 or divisible by 5");


//   LCM

//       int a = 3, b = 7;
//
//       int lcm = ( a > b ) ? a : b;
//
//       while (true){
//           if (lcm % a  == 0 && lcm % b == 0){
//               System.out.println("LCM of " + a + " and " + b + "is" + lcm);
//           break;
//           }
//           lcm++;
//       }


//   Printing Numbers

//      for (int i =1; i <= 10; i++){
//          System.out.println("The numbers are: " + i);
//          }
//

//    Printing odd numbers

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        int i =1;
//        while(i <= number){
//            System.out.println(i);
//            i += 2;
//        }
//        scanner.close();

//    Printing even numbers

//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        int i = 2;
//        while (i <= number){
//            System.out.println(i);
//            i +=2;
//        }
//        scanner.close();

//     Print numbers from 1 using while loop

//      Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        int i = 1;
//        while (i <= number){
//            System.out.println(i);
//            i++;
//        }
//        scanner.close();

//   Print numbers using do while loop

//     Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = scanner.nextInt();
//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }
//        while ( i <= number);
//        scanner.close();

//      Multiplication table for given num

//       Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = 9;
//        int i = 1;
//        while (i <= 10){
//            System.out.println(num + "*" + i + "=" + (num * i));
//            i++;
//         }
//

//   Sum of digits

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = scanner.nextInt();
//        int sum = 0;
//        while (num>0){
//            int digit = num %10;
//            sum = sum+digit;
//            num = num / 10;
//        }
//        System.out.println("Sum of digits = "+ sum);
//       }
//    }


//  call by value

        int x = 10;
        System.out.println("Before : " + x);
        change(x);
        System.out.println("After : " + x);
    }
    public static void change(int n){
    n = 20;
    }
}



