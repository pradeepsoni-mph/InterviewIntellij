package interview.company.nagarro;

import java.util.Arrays;

public class FindDuplicateArrayByStream {
    public static void main(String[] args) {
        int nums[]={2,5,3,9,2,6,5};
        Arrays.stream(nums).distinct().forEach(System.out::println);
        
    }
}
