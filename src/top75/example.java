package top75;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class example {
    public static void main(String[] args) {

        List<List<String>> listofList = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction","Stream"));

        List<String> result = listofList.stream()
                .flatMap(List::stream)
                .filter( s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());


        System.out.println(result);




    }

}
