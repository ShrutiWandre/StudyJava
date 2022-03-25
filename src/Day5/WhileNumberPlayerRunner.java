package Day5;

public class WhileNumberPlayerRunner {

    public static void main(String[] args) {
        WhileNumberPlayer whileNumberPlayer = new WhileNumberPlayer(40);

        whileNumberPlayer.printSquaresUptoLimit();  //e.g. limit = 30, output = 1 4 9 16 25

        whileNumberPlayer.printCubesUptoLimit();    // e.g. limit = 30, output = 1 8 27
    }

}
