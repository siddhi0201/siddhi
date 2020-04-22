package learn.implementing.map;

import java.util.HashMap;

public class HashMapFunctions {
	
	
	
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		HashMap<Employee,Integer> map = new HashMap<Employee,Integer>();
		
		map.put(e1, 2);
		map.put(e2, 3);
		map.put(e1, 3);
		
		System.out.println(map.size());
		System.out.println(map.get(e1));
		System.out.println(map.containsKey(e1));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
			}
	
}
