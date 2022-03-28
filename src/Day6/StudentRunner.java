package Day6;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        int [] marks = {85, 90, 93, 80, 75};
        Student student = new Student("Shruti", marks);

        int number = student.getNumberOfMarks();
        System.out.println("Number pf Marks --> " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of Marks --> " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum marks got --> " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum marks got --> " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average of total marks --> " + average);

    }

}
