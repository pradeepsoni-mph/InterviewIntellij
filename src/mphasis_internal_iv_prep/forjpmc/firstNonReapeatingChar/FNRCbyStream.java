//https://www.java-success.com/java-8-string-streams-finding-first-non-repeated-character-functional-programming/

package mphasis_internal_iv_prep.forjpmc.firstNonReapeatingChar;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FNRCbyStream {
	public static void main(String[] args) {
		System.out.println("  Please  enter  the  input  string  :");
		Scanner in = new Scanner(System.in); // read from System input
		String input = in.nextLine();
		Character firstNonRepeatedChar = logic(input);
		System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
		in.close();
	}

	private static Character logic(String input) {
		Character result = input.chars() // string stream
				.mapToObj(i -> Character.toLowerCase(Character.valueOf((char) i))) // convert to lowercase & then to
																					// Character object
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) 
				// store in a map with the count
				.entrySet().stream() // entryset stream
				.filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst().get();

		return result;
	}
}
