package Generalq;

class A1
{
	public void f1()
	{
		System.out.println("f1()");
	}
}
class BaseD extends A1
{
	public void f2()
	{
		System.out.println("f2()");
	}
	public static void main(String arg[])
	{
		A1 a = new BaseD();

		a.f1();

		//a.f2(); //cannot find symbol f2() at A.
		
		//BaseD b = new A(); //incompatible types found A, required BaseD.

	}
}
