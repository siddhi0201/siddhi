package important.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {
	
	public static void main(String args[])
	{
	HashMap<Integer, Integer> map = new HashMap<>();
	Map<Integer,Integer> sortedKeyMap = new LinkedHashMap<>();
	map.put(4, 2);
	map.put(1, 3);
	map.put(9, 0);
	
	Set<Entry<Integer,Integer>> set = map.entrySet();
	
	ArrayList<Entry<Integer,Integer>> listMap = new ArrayList<>(set);
	
	Collections.sort(listMap, (e1,e2) -> e1.getKey().compareTo(e2.getKey()));

	
	for(Entry<Integer,Integer> entry : listMap) {
		sortedKeyMap.put(entry.getKey(), entry.getValue());
	}
	System.out.println(sortedKeyMap);
	
			}
}
