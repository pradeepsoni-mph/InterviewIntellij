package Holdingyo;

class ArrayPrg
{
	public static void main(String arg[])
	{
		int a[] = new int[5];
		int b[]= new int[5];

		for(int i=0; i<5; i++)
			a[i] = i;		
		for(int i=5,j=0; i<10;j++, i++)
			b[j] = i;		
		for(int i=0; i<5;i++)
			System.out.println("a= " + a[i] + 
			" and b " + b[i]);

		a = b;
		System.out.println("Aftr assign b to a");
		for(int i=0; i<5;i++)
			System.out.println("a= " + a[i] + 
			" and b " + b[i]);


	}
}
