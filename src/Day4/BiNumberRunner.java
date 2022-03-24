package Day4;

public class BiNumberRunner {

    public static void main(String[] args){
        BiNumber biNumber = new BiNumber(1230,30);
        System.out.println("Adding Numbers: " + biNumber.addNumbers());
        System.out.println("Subtracting Numbers: " + biNumber.subtractNumbers());
        System.out.println("Multiplying Numbers: " + biNumber.multiplyNumbers());
        System.out.println("Dividing Numbers: " + biNumber.divideNumbers());
        biNumber.doubleNumber(); //double the values of both numbers
        System.out.println("Doubling Number1: " + biNumber.getNumber1());
        System.out.println("Doubling Number2: " + biNumber.getNumber2());
    }
}
