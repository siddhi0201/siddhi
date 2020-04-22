package practiceSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInArray {

	
	public static void main(String args[])
	{

		int arr[] = {10,20,10,30,20,30,30,2};
		boolean status = true;
		Set<Integer> nonRepeated = new HashSet<>();
		Set<Integer> nonRepeated1 = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(nonRepeated.add(arr[i]))
			{
				status = false;
//				repeated.add(arr[i]);
				
			}
			else
				nonRepeated1.add(arr[i]);
				

		}
		
		System.out.println(nonRepeated1);
		
	}
}
