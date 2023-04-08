package java_8_features.streaming.beans;

public class Product {
	int id;
	String name;
	private float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.setPrice(price);
	}

	
	public void setPrice(float price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
