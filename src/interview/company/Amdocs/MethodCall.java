package interview.company.Amdocs;

class Cl
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

class MethodCall extends Cl
{
	public void fun1()
	{
		System.out.println("MethodCall Fun1 Method");
	}

	public static void main(String args[])
	{
		Cl c=new Cl();

		MethodCall m = new MethodCall();
		m.fun1();
		m.fun();
		m.fun1();
	}
}
