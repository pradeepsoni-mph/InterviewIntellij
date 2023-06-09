package java_8_features.streaming.java8.util;

import java.util.ArrayList;
import java.util.List;


import java_8_features.streaming.java8.model.Employee;

public class CollectionUtility {
	public static List<Employee> getEmpList(){
		List<Employee> list =new ArrayList<>();
		list.add(new Employee("Pradeep",50,4000));
		list.add(new Employee("Alok",10,5000));
		list.add(new Employee("Prashant",5,3000));
		list.add(new Employee("Pradeep",35,10000));
		list.add(new Employee("Bharti",30,6000));
		list.add(new Employee("Anamika",7,8000));
		list.add(new Employee("Sanny",24,3000));
		list.add(new Employee("Mahima",19,2000));
		return list;
	}
	
}
