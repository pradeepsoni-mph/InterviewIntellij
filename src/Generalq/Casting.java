package Generalq;

class A
{
	static int a=10;

	static 
	{
		System.out.println("Static Block");		
	}

	public static void fun()
	{
		System.out.println("Fun()");
	}
}
class Casting extends A
{
	public static void main(String ar[])
	{
		System.out.println(++(new A().a));
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(A.a);
	}
}
