package learn.implementing.map;

import java.util.HashMap;

public class Practice1 {

	public static void main(String args[])
	{
		HashMap<String, String> map = new HashMap<>();
		map.put("siddhi", "saxena");
		map.put("saumitra", "vatsal");
		map.put("sakshi", "sehgal");
		map.put("siddhi", "abc");
		
		System.out.println("elements of Hashmap are" +map);
		
		System.out.println(map.size());
	}

}
