package Day3;

public class BookRunner {

     public static void main(String[] args){

        //********* Object Creation ***********
        System.out.println("******* Default Constructor ******");

        Book algorithmBook = new Book();
        System.out.printf("Algorithm Books Available: ",algorithmBook.getNumberOfCopies()).println();
        //System.out.println(algorithmBook.getNumberOfCopies());

        Book dataStructure = new Book();
        System.out.printf("Data Structure Books Available: %d",dataStructure.getNumberOfCopies()).println();
        //System.out.println(dataStructure.getNumberOfCopies());

        Book effectiveJava = new Book();
        System.out.printf("Effective Java Books Available: %d",effectiveJava.getNumberOfCopies()).println();
        //System.out.println(effectiveJava.getNumberOfCopies());

        Book computerNetwork = new Book();
        System.out.printf("Computer Network Books Available: %d",computerNetwork.getNumberOfCopies()).println();
        //System.out.println(computerNetwork.getNumberOfCopies());


        //********** Getters and Setters ********
        System.out.println("\n****** Getters and Setters ******");
        algorithmBook.setNumberOfCopies(200);
        System.out.printf("Algorithm Books Available: %d",algorithmBook.getNumberOfCopies()).println();

        dataStructure.setNumberOfCopies(340);
        System.out.printf("Data Structure Books Available: %d",dataStructure.getNumberOfCopies()).println();

        effectiveJava.setNumberOfCopies(230);
        System.out.printf("Effective Java Books Available: %d",effectiveJava.getNumberOfCopies()).println();

        computerNetwork.setNumberOfCopies(340);
        System.out.printf("Computer Network Books Available: %d",computerNetwork.getNumberOfCopies()).println();


        //********** Encapsulation and abstraction *********
        System.out.println("\n****** Encapsulation and abstraction ******");
        algorithmBook.increaseNumberOfCopies(50);
        System.out.printf("Algorithm Books Available: %d",algorithmBook.getNumberOfCopies()).println();

        algorithmBook.decreaseNumberOfCopies(30);
        System.out.printf("Algorithm Books Available: %d",algorithmBook.getNumberOfCopies()).println();


        //********** Constructor *********
        System.out.println("\n****** Constructor ******");
        algorithmBook = new Book(120);
        System.out.printf("Algorithm Books Available: %d",algorithmBook.getNumberOfCopies()).println();

        dataStructure = new Book(130);
        System.out.printf("Data Structure Books Available: %d",dataStructure.getNumberOfCopies()).println();

        effectiveJava = new Book(140);
        System.out.printf("Effective Java Books Available: %d",effectiveJava.getNumberOfCopies()).println();

        computerNetwork = new Book(150);
        System.out.printf("Computer Network Books Available: %d",computerNetwork.getNumberOfCopies()).println();





     }
}
