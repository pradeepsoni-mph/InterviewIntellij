package innerclasses;

interface Contents
{
	int value();
}
public class Parce17
{
	public Contents contents()
	{		
		return new Contents()
		{
			private int i=11;
			public int value() 
			{
				return i;
			}
		};
	}
	public static void main(String args[])
	{
		Parce17 p = new Parce17();
		Contents c= p.contents();
		//System.out.println(c);
	}

}

	