package Day2;

public class StudyMethod {


    static void printMultiplicationTable(int number){
        System.out.printf("Table of %d", number).println();
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d", number, i, number*i).println();
        }
    } //multiplication table by method calling

    public static void main(String[] args){
        printMultiplicationTable(5);
    }
}
