package synchronied_static;

public class Acount {
	public synchronized static void update() {
		System.out.println("Update of Account");
	}
	public synchronized void select() {
		System.out.println("Select of Account");
	}
}

//synchronized,  static , override
