package java_8_features.streaming.java8;

import java.util.List;
import java.util.function.Predicate;

import com.java8.model.Employee;
import com.java8.util.CollectionUtility;

public class FilterAndConvert {	
		public static void main(String[] args) {
			List<Employee> list = CollectionUtility.getEmpList();
		
			List<Double> gtlist1 =list.stream().filter(e->e.getSalary()>3000).map(e->e.getSalary()+5).toList();			
			gtlist1.forEach(System.out::println);
		}
}
