package threading.Threadp;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("begin");
		//suspend();
		resume();
		System.out.println("End");
	}
}
	
class Threadedp
{
	public static void main(String arg[])
	{
		int x, a=3;
		 x = a/0;

		/*try
		{
			x = a/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
			Thread1 t1 = new Thread1();
			Thread1 t2 = new Thread1();
			t1.start();
			t2.start();
		
	}
}
