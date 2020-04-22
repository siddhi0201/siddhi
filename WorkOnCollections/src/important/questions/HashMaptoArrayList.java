package important.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMaptoArrayList {
	
	public static void main(String args[])
	{
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("siddhi", "saxena");
		map.put("saxena", "siddhi");
			
		//Getting Set Of Keys
		Set<String>  keySet = map.keySet();
		
		System.out.println(map.entrySet());
		ArrayList<String> setOfKeys = new ArrayList<>(keySet);
		
		System.out.println("Array List of Keys------");
		
		for(String keys : setOfKeys)
		{
			System.out.println(keys);
		}
		
		//Getting Java8 Code
		System.out.println("Java8 Conversion");
		
		List<String> sortedList = map.keySet().stream().sorted().collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);
		
		System.out.println("-------------------------------------");
		
		//Getting collection of values
		
		Collection<String> valueSet = map.values();
		
		ArrayList<String> setOfValues = new ArrayList<>(valueSet);
		
		System.out.println("ArrayList of Values-----------");
		
		for(String values : setOfValues)
		{
			System.out.println(values);
		}
		
		System.out.println("-------------------");
		
		//java8 Conversion
		
		System.out.println("Java8 Conversion of map values-------------------------");
		
		List<String> sortedValues = map.values().stream().sorted().collect(Collectors.toList());
		
		sortedValues.forEach(System.out::println);
		
		//Getting an entrySet
		
		System.out.println("Getting an Entry Set------------------");
		
		Set<Entry<String,String>> setOfEntry = map.entrySet();
		
		ArrayList<Entry<String,String>> entrySets = new ArrayList<>(setOfEntry);
		
		for(Entry<String,String> entryOfSets : entrySets)
		{
			System.out.println(entryOfSets);
		}
		
				
		
	}

}
