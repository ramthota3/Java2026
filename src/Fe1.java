import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Functional Interface basics

public class Fe1 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer, Integer> add = (a,b)-> a+b;
        System.out.println(add.apply(19,24));
        System.out.println(add.apply(36,52));

        BiFunction<String,Integer,String> repeat = (s,n)-> s.repeat(n);
        System.out.println(repeat.apply("hi", 3));
        System.out.println(repeat.apply("Ram",5));

        Function<Integer,String> addMsg = result -> "Addition Result: " + result;

        BiFunction<Integer,Integer,String>  finalResult = add.andThen(addMsg);
        System.out.println(finalResult.apply(8,9));
        System.out.println(finalResult.apply(24,54));

    }
}
