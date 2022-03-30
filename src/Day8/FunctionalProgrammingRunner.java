package Day8;

import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Elements of integer list -->");
        integerList.stream().forEach(integer -> System.out.println(integer));

        System.out.println("Even elements of integer list -->");
        integerList.stream().filter(integer -> integer%2 == 0).forEach(integer -> System.out.println(integer));

        System.out.println("Odd elements of integer list -->");
        integerList.stream().filter(integer -> integer%2 ==1 ).forEach(integer -> System.out.println(integer));

        System.out.println("Square of first 10 numbers -->");
        IntStream.range(1,11).forEach(integer -> System.out.println(integer * integer));

        System.out.println("Print in lower case -->");
        List.of("Apple", "Ball", "Cat").stream().map(str -> str.toLowerCase()).forEach(str -> System.out.println(str));

        System.out.println("Print in upper case -->");
        List.of("Apple", "Ball", "Cat").stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
    }
}
