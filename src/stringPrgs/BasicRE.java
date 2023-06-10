package stringPrgs;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class BasicRE
{
	public static void main(String args[])
	{
		//System.out.println("-".matches("-?"));
		//System.out.println("z".matches("\\w"));
		//System.out.println("=".matches("\\W"));
		//System.out.println("8".matches("\\W"));  //false
		//System.out.println("&".matches("\\W"));
		//System.out.println("=12".matches("\\D\\d+"));
		//System.out.println("s12".matches("\\D\\d+"));
		//System.out.println("\tpradeep=12".matches("\\s\\w+\\D\\d+"));
		
		Pattern p = Pattern.compile("^\\S+");
		Matcher m = p.matcher("PRADEEP KUMAR SONI");
		while(m.find())
		{
			System.out.println(m.group() + " ");
		}



	}
}
