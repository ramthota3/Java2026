 public class Movie {

    int movieId;
    String name;

    Movie(int movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return movieId;
    }
}
 class MovieHashCodeDemo {

    public static void main(String[] args) {

        Movie m1 = new Movie(501, "Avatar");
        Movie m2 = new Movie(501, "Titanic");

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
    }
}