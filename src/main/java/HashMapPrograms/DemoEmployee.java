package HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class DemoEmployee {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		Map<Employee, String> map1 = new HashMap<Employee,String>();
		map1.put(emp1, "JacK");
		map1.put(emp2, "JacK");
		
		System.out.println(map1.size());
		
		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);
		
		Map<Integer, String> map2 = new HashMap<Integer,String>();
		map2.put(int1, "JacK");
		map2.put(int1, "JacK");
		
		System.out.println(map2.size());
		
		System.out.println(emp1.hashCode());//366712642
		System.out.println(emp2.hashCode());//1829164700
		
		System.out.println(emp1.toString());//HashMapPrograms.Employee@15db9742
		System.out.println(emp2.toString());//HashMapPrograms.Employee@6d06d69c
		
		System.out.println(emp1 == emp2);//false
		System.out.println(emp1.equals(emp2));//false
		
//		System.out.println(emp1.intern().hashCode());//2301506
//		System.out.println(emp2.intern().hashCode());//2301506
//		
//		System.out.println(emp2.intern().toString());//Java
//		System.out.println(emp2.intern().toString());//Java
		
		System.out.println(int1.hashCode());//1
		System.out.println(int2.hashCode());//1
		
		System.out.println(int1.toString());//1
		System.out.println(int2.toString());//1
		
		System.out.println(int1 == int2);//false
		System.out.println(int1.equals(int2));//true
		
//		System.out.println(emp1.intern().hashCode());//2301506
//		System.out.println(emp2.intern().hashCode());//2301506
//		
//		System.out.println(emp2.intern().toString());//Java
//		System.out.println(emp2.intern().toString());//Java
	}
}

class Employee {
	int id;
	
	public Employee(int id) {
		this.id = id;
	}
}