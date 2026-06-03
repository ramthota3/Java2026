import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Fe2 {
    public static void main(String[] args) {

        BiFunction<String, Integer, String> label = (name, score) -> name + " Scored " + score;
        System.out.println(label.apply("RAM " , 99));
        System.out.println(label.apply("SONU" , 101));

        BiFunction<Double, Double, String> ref = (a,b) ->String.format("%.2f", Math.sqrt(a*a + b*b));
        System.out.println(ref.apply(3.0,4.0));
        System.out.println(ref.apply(5.0,3.0));

        BiFunction<String, String, String> fullName = (first, last) -> first + " " + last;
        System.out.println(fullName.apply(" Thota Ram","Mohan Rao"));
        System.out.println(fullName.apply(" Dirisala ","Gowri Mohan"));
    }
}
