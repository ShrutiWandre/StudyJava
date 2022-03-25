package Day5;

import java.util.Scanner;

public class DoWhileLoopExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int val;
        do {
            System.out.println("Enter a number -->");
            val = scanner.nextInt();
            if (val < 0){
                System.out.println("You are out of loop");    //out of loop if number is negative
                return;
            }
            System.out.println("Cube is --> " + (val * val * val));
        } while (val > 0);

    }

}
