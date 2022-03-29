package Day7;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book(100, "The Java Programming Language", "James Gosling");

       // System.out.println(book);
        BookReview bookReview1 = new BookReview(201, "Good", 4);
        book.addBookReview(bookReview1);

        BookReview bookReview2 = new BookReview(202, "Excellent", 5);
        book.addBookReview(bookReview2);

        BookReview bookReview3 = new BookReview(203, "Not bad", 3);
        book.addBookReview(bookReview3);
        System.out.println(book);

    }
}
