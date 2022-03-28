package Day6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public ArrayListDemo(String name, int... marks) {
        this.name = name;
        for (int ind : marks){
            this.marks.add(ind);
        }

    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int ind:marks){
            sum = sum + ind;
        }
        return sum;
    }

    public int getMaximumMark() {
        return Collections.max(marks);
    }

    public int getMinimumMark() {
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {

        return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 3, RoundingMode.UP);
    }

    public String toString(){
        return name + marks;
    }


    public void addNewMark(int item) {
        marks.add(item);
    }

    public void removeMarkAtIndex(int ind) {
        marks.remove(ind);
    }
}
