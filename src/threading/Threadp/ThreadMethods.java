package threading.Threadp;

class A1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			if(i==1){ Thread.currentThread().yield();}
			System.out.println("\t Form Thread A: i=" + i);
		}
		System.out.println("Exit Form A");
	}
}

class B1 extends Thread
{
	public void run()
	{
		for(int j=1; j<=5; j++)
		{
			System.out.println("\t Form Thread B: j=" + j);
			if(j==3) stop();

		}
		System.out.println("Exit Form B");
	}
}

class C1 extends Thread
{
	public void run()
	{
		for(int k=1; k<=5; k++)
		{
			System.out.println("\t Form Thread C: k=" + k);
			if(k==1)
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
			}
		}

		System.out.println("Exit Form A");
	}
}

class ThreadMethods
{
	public static void main(String arg[])
	{
		A1 threadA = new A1();
		B1 threadB = new B1();
		C1 threadC = new C1();

		System.out.println("Start thread A");
		threadA.start();
		System.out.println("Start thread B");
		threadB.start();
		System.out.println("Start thread C");
		threadC.start();
		System.out.println("End of main thread");
	}
}
