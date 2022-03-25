package Day5;

public class MyNumber {

    private int myNumber;

    public MyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public Boolean isPrime() {

        if(myNumber <= 1){
            return false;
        }
        for (int chk = 2; chk <= myNumber-1; chk++){
            if( myNumber % chk == 0){
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sumNumber = 0;
        for (int val = 1; val <= myNumber; val++){
            sumNumber = sumNumber + val;
           // System.out.println(sumNumber);
        }
        return sumNumber;
    }

    public int sumOfDivisors() {

        int sumOfDivisors = 0;
        for (int chk = 2; chk <= myNumber-1 ; chk++){
            if( myNumber % chk == 0){
                sumOfDivisors = sumOfDivisors + chk;
            }
        }
        return sumOfDivisors;
    }

    public void printANumberTriangle() {
        for (int printNumber = 1; printNumber <= myNumber; printNumber++){
            for (int val = 1 ; val <= printNumber; val++){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
