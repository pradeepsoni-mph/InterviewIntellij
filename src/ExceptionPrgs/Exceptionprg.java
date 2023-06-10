package ExceptionPrgs;

class Exceptionprg
{
	public static void main(String ar[])
	{
		int x,b=0;
		int a[]={4,5};
		try
		{
			x = a[2]/b;
			System.out.println("Next Statement");
			System.out.println("Next Statement");
			/*x = a[1]/b;*/

		}
		/*catch(Exception e)
		{
			System.out.println("Exception");
		}*/
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		
	}
}
