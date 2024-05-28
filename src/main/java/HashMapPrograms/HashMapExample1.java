package HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
	public static void main(String[] args) 
	{
		Employe emp1 = new Employe(1);
		Employe emp2 = new Employe(1);
		
		Map<Employe, String> map1 = new HashMap<Employe, String>();
		map1.put(emp1, "Java");
		map1.put(emp2, "Java");
		
		System.out.println(map1.size());
		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(i1, "Java");
		map2.put(i2, "Java");
		
		System.out.println(map2.size());
	}
}

class Employe
{
	int id;
	
	public Employe(int id) 
	{
		this.id = id;
	}
}
