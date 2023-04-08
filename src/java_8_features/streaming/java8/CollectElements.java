package java_8_features.streaming.java8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java_8_features.streaming.java8.model.Employee;
import java_8_features.streaming.java8.util.CollectionUtility;

public class CollectElements {
	public static void main(String[] args) {
		List<Employee> list = CollectionUtility.getEmpList();
		List<Employee> gtlist1 = list.stream().filter(e -> e.getSalary() > 3000).collect(Collectors.toList());
				      
		gtlist1.forEach(e-> System.out.println(e));
	}
}
