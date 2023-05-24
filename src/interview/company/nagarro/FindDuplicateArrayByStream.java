package interview.company.nagarro;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateArrayByStream {
    public static void main(String[] args) {
        int nums[]={2,5,3,9,2,6,5};
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Integer nums2[]={20,5,3,9,20,6,5,20,1,1};
        List<Integer> numbers=Arrays.asList(nums2);
        //List<Integer> numbers1=Arrays.asList(20,6,5);
        // numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
        //       .collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);


        List<Integer> set=numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toCollection(TreeSet::new)).stream().collect(Collectors.toList());
        List<Integer> arr = new ArrayList<>(set);
        arr.forEach(System.out::println);
                //.collect(Collectors.toSet()).forEach(System.out::println);

    }
}
