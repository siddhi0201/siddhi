package practiceSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringWithoutBuilder {

	public static void main(String args[])
	{
		String str = "Geeks For Geeks";
		
		char[] str2 = str.toCharArray();
		
		List<Character> newList = new ArrayList<>();
		
		for(Character s: str2)
		newList.add(s);
		
		Collections.reverse(newList);
	}
	
}
