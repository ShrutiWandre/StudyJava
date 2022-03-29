package Day7;

import java.util.ArrayList;

public class Book {

    private String bookAuthor;
    private String bookName;
    private int bookId;
    private ArrayList <BookReview> bookReviews = new ArrayList<>();

    public Book(int bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public void addBookReview(BookReview bookReview){
        this.bookReviews.add(bookReview);
    }

    public String toString(){
        return String.format("Book Id --> %d, Name --> %s, Author --> %s \n Reviews --> [%s]",
                bookId, bookName, bookAuthor, bookReviews);
    }


}
