package RTTI;

class A
{
	static { System.out.println("Hello A"); }
	A(){System.out.println("Hello, Constructor A"); }
}

class B extends A
{
	static { System.out.println("Hello B"); }
	B() {System.out.println("Hello, Constructor B"); }
}

class C extends B
{
	static { System.out.println("Hello C"); }
	C() {System.out.println("Hello, Constructor C"); }
}

class D extends C
{
	static 	{ System.out.println("Hello D"); }
	D() {System.out.println("Hello, Constructor D"); }
}

class ClassLod
{
	public static void main(String arg[])
	{
		new B();
	}
}
		