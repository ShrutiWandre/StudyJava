package Day5;

public class WhileNumberPlayer {

    private int whileNumberPlayer;

    public WhileNumberPlayer(int whileNumberPlayer) {
        this.whileNumberPlayer = whileNumberPlayer;
    }

    public void printSquaresUptoLimit() {
        int val = 1;
        System.out.println("***** Squares upto limit *****");
        while ((val * val) <= whileNumberPlayer){
            System.out.println( val * val );
            val++;
        }
    }

    public void printCubesUptoLimit() {
        int val = 1;
        System.out.println("***** Cubes upto limit *****");
        while ((val * val * val) <= whileNumberPlayer){
            System.out.println( val * val * val );
            val++;
        }
    }
}
