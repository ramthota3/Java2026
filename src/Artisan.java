import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class Artisan {
     String name;
     int salary;

     Artisan(String name, int salary){
         this.name = name;
         this.salary = salary;
     }

     public String toString(){
         return name + " " + salary;

     }
}
class ArtisanNameComparatorDemo{
    public static void main(String[] args) {
        List<Artisan> artisans = Arrays.asList(
                new Artisan("Eric",25000),
                new Artisan("Dwayne", 40000),
                new Artisan("ZAYN",30000)
        );
        Comparator<Artisan> byName = (a1,a2)-> a1.name.compareTo(a2.name);

        Collections.sort(artisans,byName);
        System.out.println(artisans);
    }
}
