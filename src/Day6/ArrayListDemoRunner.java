package Day6;

import java.math.BigDecimal;

public class ArrayListDemoRunner {
    public static void main(String[] args) {

        int [] marks = {85, 90, 93, 80, 75};
        ArrayListDemo arrayListDemo = new ArrayListDemo("Shruti", marks);

        int number = arrayListDemo.getNumberOfMarks();
        System.out.println("Number pf Marks --> " + number);

        int sum = arrayListDemo.getTotalSumOfMarks();
        System.out.println("Sum of Marks --> " + sum);

        int maximumMark = arrayListDemo.getMaximumMark();
        System.out.println("Maximum marks got --> " + maximumMark);

        int minimumMark = arrayListDemo.getMinimumMark();
        System.out.println("Minimum marks got --> " + minimumMark);

        BigDecimal average = arrayListDemo.getAverageMarks();
        System.out.println("Average of total marks --> " + average);

        System.out.println(arrayListDemo);

        arrayListDemo.addNewMark(68);
        System.out.println(arrayListDemo);

        arrayListDemo.removeMarkAtIndex(2);
        System.out.println(arrayListDemo);


    }
}
