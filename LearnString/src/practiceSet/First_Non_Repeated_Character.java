package practiceSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class First_Non_Repeated_Character {
	
	public static void main(String args[])
	{
		Set<Character> nonRepeating = new HashSet<>();
		List<Character> repeating = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for(int i = 0;i<word.length();i++)
		{
			char letter = word.charAt(i);
			if(nonRepeating.contains(letter))
				continue;
			
			if(repeating.contains(letter))
			{
				repeating.remove((Character)letter);
				nonRepeating.add(letter);
			}
			
			else
			{
				repeating.add(letter);
			}
		}
		
		System.out.println(repeating.get(0));
	}
}