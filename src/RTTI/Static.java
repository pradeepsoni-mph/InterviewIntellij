package RTTI;

class A
{
	static int a=10;
	static { System.out.println("Hello A"); }
}

class Static
{
	public static void main(String aa[])
	{
		System.out.println(A.a);
	}
}
/*******************OUTPUT***********************************
Hello A
10
********************************************************/