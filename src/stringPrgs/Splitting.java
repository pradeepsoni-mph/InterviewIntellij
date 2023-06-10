package stringPrgs;

import  java.util.*;


class Splitting
{
	public static String knights = 
	"Then, When you have found the shrubbery, you must"+
	"cut down the mightiest tree in the forest... "+
	"with... a herring!";

	
	
	public static void main(String arg[])
	{
				

		String ar[] = knights.split("n\\w+");
		int i=0;
		while(ar.length>i)
		{
			System.out.println(ar[i++]);
		}
			

	}
}








































	//split(" ");
	//split("\\W+");
	//split("n\\w+");


	/*public static void split(String regex)
	{
		System.out.println(Arrays.toString(knights.split(regex)));
	}*/