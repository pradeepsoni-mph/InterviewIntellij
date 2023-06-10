package Generalq;

abstract class A
{
	public void f1()
	{
		System.out.println("F()");
	}
	
	public abstract void f2();
}

class ImpAbstract extends A
{
	public void f1()
	{
		System.out.println("Ffff()");
	}
	public void f2(){}

	public static void main(String ar[])
	{
		A a = new ImpAbstract();
		a.f1();
	}
}
	
	