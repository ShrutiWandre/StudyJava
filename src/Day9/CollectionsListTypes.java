package Day9;

import java.util.*;

public class CollectionsListTypes {
    public static void main(String[] args) {

        List<String> stringList = List.of("Pen", "Pencil", "Eraser", "Scale"); // contents of List are immutable
        System.out.println(stringList);
       // stringList.add("Sharpener");   gives runtime exception

        List<String> stringLinkedList = new LinkedList<>(stringList); // contents of List are mutable
        stringLinkedList.add("Sharpener");
        System.out.println(stringLinkedList);

        List<String> stringArrayList = new ArrayList<>(stringList); // contents of List are mutable
        stringArrayList.add("Sharpener");
        System.out.println(stringArrayList);

        List<String> stringVectorList = new Vector<>(stringList); // contents of List are mutable
        stringVectorList.add("Sharpener");
        System.out.println(stringVectorList);

        Iterator iterator = stringList.iterator(); // print using iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<String> iteratorAL = stringArrayList.iterator();
        while (iteratorAL.hasNext()){
            if (iteratorAL.next().endsWith("er")){
                iteratorAL.remove();
            }
        }
        System.out.println(stringArrayList); //words end with "er" deleted

        List values = List.of( "Shruti", 'C', 100.3, 200); //Auto boxing
        System.out.println(values);

        List<Integer> integerList = List.of(10, 20, 30, 40, 50);
        for (int i:integerList){
            System.out.println(i);
        }
        List<Integer> integerArrayList = new ArrayList<>(integerList);
        integerArrayList.remove(Integer.valueOf(20));
        System.out.println(integerArrayList);


    }
}
