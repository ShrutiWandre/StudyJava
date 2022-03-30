package Day8;

import java.util.*;

public class SetInterfaceRunner {

    public static void main(String[] args) {
        List<Character> characterList = List.of( 'C', 'D', 'E', 'C', 'B', 'C', 'A', 'G', 'a', 'b', 'd', '0', '%');


        Set<Character> treeSet = new TreeSet<>(characterList);
        System.out.println(treeSet);                           // TreeSet returns unique characters in sorted order from given list

        Set<Character> hashSet = new HashSet<>(characterList);
        System.out.println(hashSet);                           // HashSet returns unique characters in sorted order from given list

        Set<Character> linkedHashSet = new LinkedHashSet<>(characterList);
        System.out.println(linkedHashSet);                     // LinkedHashSet returns unique characters in any order from given list
    }

}
