package Holdingyo;

import java.util.ArrayList;

class Apple 
{
	private static long counter;
	private final long id = counter++;
	public long id() { return id;}
}

class Orange{}

public class AAOWG 
{
	public static void main(String args[])
	{
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0; i<3; i++)
			apples.add(new Apple());		
		//apples.add(new Orange());

		for(Apple c : apples)
		{			
			System.out.println(c.id());	
		}

		//for(int i=0; i<apples.size()-1; i++)
			//System.out.println(((Apple)apples.get(i)).id());

		//((Orange)apples.get(i)).id();
	}
}
