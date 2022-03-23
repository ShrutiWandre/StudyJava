package Day2;

public class StudyMethodWithReturnType {

    static int printAreaOfCircle(int radius){
        return ((22/7) * radius * radius);
    }

    public static void main(String[] args){

        int areaOfCircle = printAreaOfCircle(7);
        System.out.printf("Area of circle = %d", areaOfCircle).println();

    }

}
