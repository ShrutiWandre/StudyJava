package Day7;

public class BookReview {
    private int bookReviewId;
    private String bookReviewDesc;
    private int bookReviewRating;

    public BookReview(int bookReviewId, String bookReviewDesc, int bookReviewRating){
        this.bookReviewId = bookReviewId;
        this.bookReviewDesc = bookReviewDesc;
        this.bookReviewRating = bookReviewRating;
    }

    public String toString(){
        return String.format("Review Id --> %d, Description --> %s, Rating --> %d \n",
                bookReviewId, bookReviewDesc, bookReviewRating);
    }

}
