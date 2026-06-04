public class Book {

    int bookId;
    String title;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {

        Book b = (Book) obj;

        return this.bookId == b.bookId;
    }
}

 class BookEqualsDemo {

    public static void main(String[] args) {

        Book b1 = new Book(101, "Java");
        Book b2 = new Book(101, "Python");

        System.out.println(b1.equals(b2));
    }
}