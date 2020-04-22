package learn.implementing.map;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ImplementSet {

	public static void main(String args[])
	{
//		TreeSet<String> se = new TreeSet<>();
		
		HashSet<String> se = new HashSet<>();
		
		//hashset doesnt supprt orderring
		//treeset supprt ordering
		
		se.add("siddhi");
		se.add("saxena");
		se.add("siddhi");
		se.add("sid");
		
		for(String out : se)
		{
			System.out.println(out);
		}
		
		System.out.println(se.size());
		
	}
	
	
}
