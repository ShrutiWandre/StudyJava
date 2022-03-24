package Day4;

import java.math.BigDecimal;

public class SIAmountCalculator {

    private BigDecimal principal;
    private BigDecimal interestRate;

    public SIAmountCalculator(String principal, String interestRate) {
            this.principal = new BigDecimal(principal);
            this.interestRate = new BigDecimal(interestRate).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalAmount(int numberOfYears) {
            BigDecimal totalAmount = principal.add
                    (principal.multiply
                            (interestRate.multiply(new BigDecimal(numberOfYears))));
            return totalAmount;
    }
}
