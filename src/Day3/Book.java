package Day3;

public class Book {

    //state
    private int numberOfCopies;


    //behaviour
    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        if(numberOfCopies > 0)  // to prevent bad data
        this.numberOfCopies = numberOfCopies;
    }

    public void increaseNumberOfCopies(int byThis){
        this.numberOfCopies = this.numberOfCopies + byThis;
    }

    public void decreaseNumberOfCopies(int byThis){
        if((this.numberOfCopies - byThis) > 0 )
        this.numberOfCopies = this.numberOfCopies - byThis;
    }


    Book(){
        this(100);       //By default number of copies set to 100
    }

    Book(int numberOfCopies){
        this.numberOfCopies = numberOfCopies;    // if we don't provide this constructor, java by default provide defaukt constructor
    }


}
