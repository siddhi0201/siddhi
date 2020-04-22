package practiceSet;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfArrayElements {
	
	public static void main(String args[])
	{
		int arr[] = {10,20,10,30,20,20,20,10,40};
		String arr1[] = {"siddhi","siddhi","siddhi","siddhi","saxena","sid","saxena","betu",
				"betu"};
		
		
		Map<String,Integer> count = new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			if(count.containsKey(arr1[i]))
			{
				count.put(arr1[i], (count.get(arr1[i])+1));
			}
			else
			count.put(arr1[i], 1);
		}
	
		System.out.println("Count of elements present in array is" +count);
	}
}
