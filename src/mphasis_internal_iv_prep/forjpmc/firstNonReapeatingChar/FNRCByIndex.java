package mphasis_internal_iv_prep.forjpmc.firstNonReapeatingChar;

public class FNRCByIndex {
	public static void main(String[] args) {
		String str = "pradeep";
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
				System.out.println("First non-repeat char: " + str.charAt(i));
				break;
			}
		}
	}
}
