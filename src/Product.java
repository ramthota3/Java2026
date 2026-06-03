import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;

    }
}
    class ProductExample{
        public static void main(String[] args) {
            List<Product> products = Arrays.asList(
                    new Product ("Laptop" , 250000),
                    new Product("Mobile", 200000),
                    new Product("Airpods" , 25000)
            );
            BiFunction<Integer,Integer,Integer> finalPrice = (price ,gstPercent) ->price+(price*gstPercent/100);

            Function<Integer,String> format = amount ->  "finalPrice = " +amount;

            BiFunction<Integer,Integer,String> bill = finalPrice.andThen(format);

            products.stream()

                    .map(p -> p.name + "->" +
                            bill.apply(p.price,18))
                    .forEach(System.out::println);

        }
}
