package Holdingyo;

class A {}

class Ar
{
	public static void main(String ar[])
	{
		A a[] = new A[6];

		for(int i=0; i< 6; i++)
			a[i] = new A();
		for(int i=0; i<6; i++)
			System.out.println(a[i]);
	}
}