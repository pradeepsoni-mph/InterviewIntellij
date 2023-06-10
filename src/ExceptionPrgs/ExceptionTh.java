package ExceptionPrgs;

class ExceptionTh
{
	public static Integer f() throws Exception
	{
		return 42;
	}

	public static void main(String arg[])
	{
		int x=0;
		try
		{
			x = f();
		}
		catch(Exception e)
		{
			System.out.println(e);
			//x++;
		}
		finally
		{
			System.out.println(++x);
		}
	}
}
	