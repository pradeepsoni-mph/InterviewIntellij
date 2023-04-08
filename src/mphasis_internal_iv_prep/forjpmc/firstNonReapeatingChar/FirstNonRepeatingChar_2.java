package mphasis_internal_iv_prep.forjpmc.firstNonReapeatingChar;

import java.util.Scanner;

public class FirstNonRepeatingChar_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter input String : ");
	String s1=scanner.nextLine();
	char charArray[]=s1.toCharArray();
	for(int i=0;i<charArray.length;i++) {
		if(s1.lastIndexOf(charArray[i])==s1.indexOf(charArray[i])) {
			System.out.println("First non repeating character in string "+s1+" is "+charArray[i]);
			break;
		}
	}
}
}
