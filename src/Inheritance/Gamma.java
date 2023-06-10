package Inheritance;

class Alpha {
	int a;
	String getTypea() {
		return "alpha_a";
	}
	String getType() {
		return "alpha";
	}
}

class Beta extends Alpha {
	int b;
	String getTypeb() {
		return "alpha_b";
	}
	String getType() {
		return "beta";
	}
}

class Gamma extends Beta {
	int c;
	String getTypec() {
		return "alpha_c";
	}
	String getType() {
		return "gamma";
	}
	public static void main(String[] args) {
		Alpha a = new Beta();		
		System.out.println(((Beta)a).getTypeb());
		
		//System.out.println(g1.getType()+" "+g2.getType());
	}
}
