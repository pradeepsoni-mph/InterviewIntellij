package mphasis_internal_iv_prep.forjpmc.find2ndminNoArray;

import java.util.Arrays;

public class Find2ndminNoArray {
	public static void main(String[] args) {
		int numbers[]= {3,9,8,8,5,3,3};//{9,3,5,8,4,7,8};
		System.out.println("\nThe List of numbers: ");
		Arrays.stream(numbers).forEach(System.out::println);
//		for(int n:numbers) {
//			System.out.print(n+"\t");
//		}
		Arrays.sort(numbers);
		System.out.println("\nThe List of sorted numbers: ");
		for(int n:numbers) {
			System.out.print(n+"\t");
		}
		
		System.out.println("\nThe Second smallest no: "+numbers[1]);
	}
}
