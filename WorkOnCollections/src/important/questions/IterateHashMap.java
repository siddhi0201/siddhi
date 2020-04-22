package important.questions;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
	
	public static void main(String args[])
	{
	HashMap<Integer,String> map = new HashMap<>();
	
	map.put(1, "siddhi");
	map.put(2, "saxena");
	map.put(3, "arc");
	map.put(4, "sid");
	map.put(5, "sax");
	
	for(Map.Entry<Integer,String> entrySet : map.entrySet())
	{
		System.out.println("key =" +"------" +entrySet.getKey() 
		                    +"value =" +"---------" +entrySet.getValue());
	}
	}
}
