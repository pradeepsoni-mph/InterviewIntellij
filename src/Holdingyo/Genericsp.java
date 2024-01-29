package Holdingyo;

import java.util.ArrayList;

class A {}
class B extends A {}
class C extends B {}

class D extends A {}

class Genericsp
{
	public static void main(String args[])
	{
	     ArrayList<B> a = new ArrayList<B>();
	 	//a.add(new A());
		a.add(new B());
		a.add(new C());
		//a.add(new D());
		for(A aa : a)
			System.out.println(aa);
	}
}
