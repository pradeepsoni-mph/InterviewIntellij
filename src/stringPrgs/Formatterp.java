package stringPrgs;

import java.util.*;

class Formatterp
{

	public static void main(String a[])
	{
		Formatter f = new Formatter(System.out);
		String s="pradeep";
		int x=1234;
		System.out.format("Hello %s have the Rs. %d in his pocket\n", s, x);
		System.out.println("Hello %s have the Rs. %d in his pocket\n" + s +  x);
		f.format("%-15s is %8d\n",s, x);
	}
}

