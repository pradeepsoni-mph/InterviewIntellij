package Holdingyo;

class A1 {}

class Ar
{
	public static void main(String ar[])
	{
		A1 a[] = new A1[6];

		for(int i=0; i< 6; i++)
			a[i] = new A1();
		for(int i=0; i<6; i++)
			System.out.println(a[i]);
	}
}