package Day4;

import java.util.Scanner;

public class IfElseExerciseRunner {

    public static void main(String[] args) {
        System.out.println("Enter First number: ");
        Scanner firstNumberScan = new Scanner(System.in);
        int firstNumber = firstNumberScan.nextInt();

        System.out.println("Enter Second number: ");
        Scanner secondNumberScan = new Scanner(System.in);
        int secondNumber = secondNumberScan.nextInt();

        System.out.println("What you want to do?: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        Scanner operation = new Scanner(System.in);
        int choiceOperation = operation.nextInt();
        if (choiceOperation == 1){
            System.out.println("Addition is: " + (firstNumber + secondNumber));
        } else if (choiceOperation == 2){
            System.out.println("Subtraction is: " + (firstNumber - secondNumber));
        } else if (choiceOperation == 3){
            System.out.println("Multiplication is: " + (firstNumber * secondNumber));
        } else if (choiceOperation == 4){
            System.out.println("Division is: " + (firstNumber / secondNumber));
        } else {
            System.out.println("Invalid Selection");
        }



    }

}
