package synchronied_static;

class C {
	public  synchronized void m1() {
		System.out.println("A m1()");
	}
}

class B extends C {
	@Override
	public  synchronized void m1() {
		System.out.println("B m1()");
	}
}

class A {
	public static void main(String[] args) {
		C b = new B();
		b.m1();
	}
}
