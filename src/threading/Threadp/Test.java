package threading.Threadp;

class ThreadClass implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Pradeep" +  i);
		}
	}
}

class Test 
{
	public static void main(String arg[])
	{
		ThreadClass tc = new ThreadClass();
		Thread t = new Thread(tc,"pushpendra Thread");
		t.start();
		//t.stop();
		t.suspend();		
		System.out.println("suspended thread");

		try
		{
			t.sleep(1000);
		}
		catch(InterruptedException e)
		{}

		t.resume();
		System.out.println("End of Main thread");
	}
}
/******************OUTPUT*****************
D:\Pradeep\PRG\Threadp>java Test
suspended thread
End of Main thread
Pradeep0
Pradeep1
Pradeep2
Pradeep3
Pradeep4
Pradeep5
Pradeep6
Pradeep7
Pradeep8
Pradeep9

D:\Pradeep\PRG\Threadp>

***************************************/














