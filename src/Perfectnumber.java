import java.util.Scanner;

public class Perfectnumber {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++){
            if (n % i == 0) {
                sum = sum +i;
            }
        }
      if (sum == n){
          System.out.println("Perfectnumber");
      } else {
          System.out.println("Not a perfectnumber");
      }
      scanner.close();

    }
}