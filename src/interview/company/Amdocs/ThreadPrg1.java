

class RunT implements Runnable
{
	public void run()
	{
		System.out.print("Run Method");
	}
}

class ThreadPrg1
{
	public static void main(String args[])
	{
		Thread t = new Thread(new RunT());
		t.run();
		t.run();
		t.start();
	}
}


