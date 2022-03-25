package Day5;

public class MyNumberRunner{

    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(4);

        Boolean isPrime =  myNumber.isPrime();   //  Is a number prime or not?
        System.out.println("Given number prime? -->" + isPrime);

        int sumNumber = myNumber.sumUptoN();  // sum of numbers upto n e.g. 1 + 2 + 3 + 4 + 5 + 6
        System.out.println("Sum of numbers upto n -->" + sumNumber);

        int sumOfDivisors = myNumber.sumOfDivisors();
        System.out.println("Sum of Divisors -->" + sumOfDivisors);

        System.out.println("Number triangle -->");
        myNumber.printANumberTriangle();


    }


}
