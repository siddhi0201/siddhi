package important.questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMapUsingIterator {
	
	public static void main(String args[])
	{
		
	Map<Integer,String> map = new HashMap<>();
	map.put(1, "siddhi");
	map.put(2, "saxena");
	
	
	Iterator mapIterator = map.entrySet().iterator();
	
	
	}

}
