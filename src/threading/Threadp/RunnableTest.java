package threading.Threadp;

class X implements Runnable
{
	public void run()
	{	
		for(int i=1; i<=10; i++)
		{
			System.out.println("\t threadX : " + i);
		}
		System.out.println("End of Threadx");
	}
}

class RunnableTest
{
	public static void main(String arg[])
	{
		X  x = new X();
		Thread t = new Thread(x);
		t.start();
		System.out.println("End of Main method");
	}
}
