package practiceSet;

import java.util.Scanner;

public class AlternatingCharacter {
	
	public static void main(String args[])
	{
//		List<String> repeating = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int count =0;
		
		for(int i=0;i<(word.length()-1);i++)
		{
				
			
				if(word.charAt(i) ==word.charAt(i+1))
				{
					
//					repeating.remove((Character)(word.charAt(i)));
					count++;
				}
				continue;
			
		}
		System.out.println(count);
		
	}

	

}
