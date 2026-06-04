public class Books {

    int bookId;
    String title;

    Books(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {

        Books b = (Books) obj;

        return this.bookId == b.bookId;
    }

    @Override
    public int hashCode() {
        return bookId;
    }
}

 class BooksDemo {

    public static void main(String[] args) {

        Books b1 = new Books(101, "Java Programming");
        Books b2 = new Books(101, "Python Programming");

        System.out.println("Equals Result : " + b1.equals(b2));

        System.out.println("HashCode of b1 : " + b1.hashCode());

        System.out.println("HashCode of b2 : " + b2.hashCode());
    }
}