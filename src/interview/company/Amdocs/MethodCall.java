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

		MethodCall m = new MethodCall();
		m.fun1();
		m.fun();
		m.fun1();
	}
}
