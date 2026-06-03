import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Employee {
    String name;
    int workingDays;
     Employee( String name, int workingDays){
         this.name = name;
         this.workingDays = workingDays;
     }
}
   class salaryExample {
       public static void main(String[] args) {
           List<Employee> employees = Arrays.asList(
               new Employee("Ram", 25),
               new Employee("Ravi", 22),
               new Employee("Raj", 19)
           );

           BiFunction<Integer, Integer, Integer> salary = (days, perDay) -> {
               int total = days * perDay;

               if (days >= 20) {
                   total += 5000;
               }
               return total;
           };
           Function<Integer, String> format = amount -> "salary = " + amount;

           BiFunction<Integer,Integer,String> salarySlip = salary.andThen(format);

           employees.stream()
                   .map(emp -> emp.name + "-> " +
                           salarySlip.apply(emp.workingDays, 1000))
                   .forEach(System.out::println);
       }
 }