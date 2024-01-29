package Generalq;

interface AI
{
	public void f1();
	//public void f2();
	//public void f3();
}

class B implements AI
{
	public void f1()
	{
		System.out.println("F1()");
	}
	/* It is must be required to implement all function of all methods of interface
	   otherwise it give error that not define the function f3(); 
	   means from last or lower to upper.
	*/

}

class InterfaceImp 
{
	public static void main(String ar[])
	{
		B b = new B();
		b.f1();
	}
}
