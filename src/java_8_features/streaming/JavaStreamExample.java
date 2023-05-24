package java_8_features.streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java_8_features.streaming.beans.Product;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 38000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		//List<Integer> list=productsList.stream().filter(p -> p.getPrice() > 3000).map(pm->pm.getPrice()).toList(); // filtering price
				//.map(pm -> pm.getPrice()).toList(); // fetching price
		//list.forEach(System.out::println); // iterating price
/*
		List<Integer> pricesList =  productsList.stream()  
                 .filter(p ->p.getPrice()> 3000)   // filtering price
                 .map(pm ->pm.getPrice())          // fetching price  
                 .collect(Collectors.toList());  
     	System.out.println(pricesList);
*/
		productsList.stream().filter(p->p.getPrice()>3000f).forEach(System.out::println);

	}
}
