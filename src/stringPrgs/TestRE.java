package stringPrgs;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


class TestRE
{
	public static void main(String ar[])
	{
		if(ar.length < 2)
		{
			System.out.println("usage:\njava testRE" + 
			"Character Sequence Regular Expression +");
			System.exit(0);
		}

		System.out.println("Input: \""+ ar[0] + "\"");

		for(String arg : ar)
		{
			System.out.println("Regular Expression : \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(ar[0]);

			while(m.find())
			{
				System.out.println("Match\"" + m.group() + 
				"\" at positions " + 
				m.start() + "-" + (m.end()-1));
			}
		}
	}
}

			