
package mphasis_internal_iv_prep.forjpmc.firstNonReapeatingChar;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str="pradeep";
		//HashMap<Character,Integer> countChar=new HashMap();
		LinkedHashMap<Character,Integer> countChar=new LinkedHashMap();
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(countChar.containsKey(ch)) {
				countChar.put(ch, countChar.get(ch)+1);				
			}else {
				countChar.put(ch, 1);
			}
		}
		System.out.println(countChar);
		for(Map.Entry<Character, Integer> entry:countChar.entrySet()) {
			int c=entry.getValue();
			if(c==1) {
				System.out.println("First Non-Repeating char:"+entry.getKey());
				break;
			}
		}
	}	
}
