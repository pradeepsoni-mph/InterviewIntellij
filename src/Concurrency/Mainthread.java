package Concurrency;

public class Mainthread
{
	public static void main(String arg[])
	{
		LiftOff launch = new LiftOff();
		new Thread(launch).start();
		//launch.run();
	}
}

/**************Output************************
D:\Pradeep\PRG\Concurrency>java Mainthread >> Mainthread.java
/*************************************
#0(9),
#0(8),
#0(7),
#0(6),
#0(5),
#0(4),
#0(3),
#0(2),
#0(1),
#0(Liftoff!),
**********************************************/