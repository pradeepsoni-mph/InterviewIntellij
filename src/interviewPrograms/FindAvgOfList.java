package interviewPrograms;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class FindAvgOfList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(23, 56, 78, 12, 46, 89, 11, 134, 234, 1, 5, 9);  
		IntSummaryStatistics iss = list.stream().mapToInt((a) -> a). summaryStatistics();  
		System.out.println("The average of the List is: "+iss.getAverage()); 
		
		OptionalDouble avg = list.stream().mapToInt((a) -> a).average();
		System.out.println("The average of the List is: "+avg); 
		
		int sum = list.stream().mapToInt((a) -> a).sum();
		System.out.println("The average of the List is: "+sum);
		
	}
}
