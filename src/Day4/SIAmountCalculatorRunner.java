package Day4;

import java.math.BigDecimal;

public class SIAmountCalculatorRunner {

    public static void main(String[] args){
        SIAmountCalculator siAmountCalculator = new SIAmountCalculator("1200.00", "5");
        BigDecimal totalAmount = siAmountCalculator.calculateTotalAmount(5);
        System.out.println("Total Amount = " + totalAmount); //Total Amount = Principal + ((Principal * Interest Rate * Number of Years)/100)
    }
}
