package java_8_features.streaming.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java_8_features.streaming.java8.model.Employee;
import java_8_features.streaming.java8.util.CollectionUtility;

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee> list = CollectionUtility.getEmpList();
		System.out.println("List of employees: ");
		list.forEach(System.out::println);
		System.out.println("Sorted list of employees: ");
		list.stream().sorted().
        forEach(System.out::println);

		list.sort((o1, o2)
				-> o1.getName().compareTo(
				o2.getName()));

	}		
}
