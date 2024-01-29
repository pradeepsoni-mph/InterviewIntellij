package java_11_feature;

import java.util.List;
import java.util.stream.Collectors;

public class StringClass {
    public static void main(String[] args) {
        String str = "JD\nJD\nJD";
        System.out.println(str);
        List<String> strList=str.lines().toList();
        strList.forEach(System.out::println);
        //System.out.println(str.lines().collect(Collectors.toList()));
    }
}
