import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Fe3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40);

        BiFunction<Integer, Integer, Integer> add = (a,b) -> a+b;

        Function<Integer,Integer> square = n -> n * n;

        BiFunction<Integer, Integer, Integer> addAndSquare = add.andThen(square);

             numbers.stream()
                .map(num -> addAndSquare.apply(num, 7))
                .forEach(System.out::println);

    }
}
