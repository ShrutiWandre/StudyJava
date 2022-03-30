package Day8;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceRunner {
    public static void main(String[] args) {
        String strDefinition =
               "The map interface is present in java.util package represents a mapping between a key and a value." +
                       " The Map interface is not a subtype of the Collection interface." +
                       " Therefore it behaves a bit differently from the rest of the collection types. " +
                       "A map contains unique keys.";

        Map<Character ,Integer> charOccurances = new HashMap<>();
        char[] charArray = strDefinition.toCharArray();
        for (char chr:charArray){
            Integer integer = charOccurances.get(chr);
            if (integer == null){
                charOccurances.put(chr, 1);
            }else {
                charOccurances.put(chr, integer + 1);
            }
        }
        System.out.println("Unique characters with number of occurances -->");
        System.out.println(charOccurances);


        Map<String ,Integer> strOccurances = new HashMap<>();
        String[] strArray = strDefinition.split(" ");
        for (String str : strArray){
            Integer integer = strOccurances.get(str);
            if (integer == null){
                strOccurances.put(str, 1);
            }else {
                strOccurances.put(str, integer + 1);
            }
        }
        System.out.println("Unique strings with number of occurances -->");
        System.out.println(strOccurances);

    }
}
