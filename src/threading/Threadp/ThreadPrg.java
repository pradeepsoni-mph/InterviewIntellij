package threading.Threadp;

class ThreadPrg
{
	public static void main(String a[])
	{
		try
		{		
			Threaded t1 = new Threaded();
			Threaded t2 = new Threaded();
			//t1.setName("pk");
			//t2.setName("Pu");
			t1.start();
			t2.start();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Threaded extends Thread
{
	public void run()
	{
				
		if(getName().equals("Thread-0"))
			System.out.println("Hello");
		else if(getName().equals("Thread-1"))
			System.out.println("World");
	}
}
