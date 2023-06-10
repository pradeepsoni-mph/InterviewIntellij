class Cl1
{
	
	public void fun()
	{
		System.out.println("Fun Method");
	}
	
	public void fun1()
	{
		System.out.println("Fun1 Method");
	}
}

class MethodPoly extends Cl1
{
	public void fun1()
	{
		System.out.println("MethodCall Fun1 Method");
	}

	public static void main(String args[])
	{
		Cl1 c=new Cl1();

		MethodPoly m = new MethodPoly();

		m.fun1();
		m.fun();
		c.fun1();
		//c = m;
		//c.fun1();

		try
		{
			m = (MethodPoly)c;
		}
		catch(Exception e){}

		m.fun1();
		m.fun();

	}
}
