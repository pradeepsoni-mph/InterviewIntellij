package stringPrgs;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Finding
{
	public static void main(String []arg)
	{
Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");

		while(m.find())
		{
			System.out.println(m.group() + " ");
		}

		
		int i=0;

		while(m.find(i))
		{
			System.out.print(m.group() + " " );
			i++;
		}
		System.out.println();
	}
}
/******************OUTPUT**************************/


