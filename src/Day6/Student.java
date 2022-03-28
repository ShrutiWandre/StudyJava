package Day6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private int[] marks;
    private String name;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int ind:marks){
            sum = sum + ind;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maxValue = Integer.MIN_VALUE;
        for (int ind:marks){
            if(ind > maxValue){
                maxValue = ind;
            }
        }
        return maxValue;
    }

    public int getMinimumMark() {
        int minValue = Integer.MAX_VALUE;
        for (int ind:marks){
            if(ind < minValue){
                minValue = ind;
            }
        }
        return minValue;
    }

    public BigDecimal getAverageMarks() {

        return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 3, RoundingMode.UP);
    }
}
