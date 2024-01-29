package interview.company.Amdocs;

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

class MethodPoly1 extends Cl1
{
	public void fun1()
	{
		System.out.println("MethodCall Fun1 Method");
	}

	public static void main(String args[])
	{
		Cl1 c=new Cl1();

		MethodPoly1 m = new MethodPoly1();

		m.fun1();
		m.fun();
		c.fun1();
		//c = m;
		//c.fun1();

		try
		{
			m = (MethodPoly1)c;
		}
		catch(Exception e){}

		m.fun1();
		m.fun();

	}
}
