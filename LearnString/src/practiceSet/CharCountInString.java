package practiceSet;

import java.util.HashMap;
import java.util.Scanner;

public class CharCountInString {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] wordCount = word.toCharArray();
		
		for(char c : wordCount)
		{
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}
		else
		map.put(c, 1);
		}
		
		System.out.println("inputString" +map);
	}

}
