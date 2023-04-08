package java_8_features.streaming.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.java8.model.Employee;
import com.java8.util.CollectionUtility;

public class SortEmployee {
	public static void main(String[] args) {
		List<Employee> list =CollectionUtility.getEmpList();
		list.stream().sorted().
        forEach(System.out::println);		
	}		
}
