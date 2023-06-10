package ExceptionPrgs;

class ExceptionThrowPrg

{
	public static void f() throws Exception
	{
		throw new Exception();
	}
	public static void main(String ar[])
	{
		try
		{
			f();
		}
		catch(Exception e)
		{
			System.out.println("Pradeep");
		}
	}
}
