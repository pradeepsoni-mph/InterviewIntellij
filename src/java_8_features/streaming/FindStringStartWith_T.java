package java_8_features.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindStringStartWith_T {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zech", "Vidvan", "Java", "Tutorials", "tV2");
        /*declare the predicate type as a string and use a lambda expression to create object */
       // Predicate<String> p = (s) -> s.startsWith("T");
        // Iterate through the list
//        for (String st : names) {
//            // call the test method
//            if (p.test(st)) System.out.println(st);
//
//        }
        names.stream().filter(s -> s.startsWith("T")).forEach(System.out::println);
    }
}