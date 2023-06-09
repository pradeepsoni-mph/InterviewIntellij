package Concurrency;

import java.util.concurrent.*;

class ADaemon implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exiting via InterruptedException");
		}
		finally
		{
			System.out.println("This should always run?");
		}
	}
}

public class DaemonsDontRunFinally
{
	public static void main(String arg[])
	{
		Thread t = new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}
}
