package practiceSet;

import java.util.ArrayList;

public class ReturnUniqueArray {

	public static void main(String args[])
	{
		int arr[] = {1,3,4,2,1,4,5,6,7,7};
		int arr2[] = new int[arr.length];
		ArrayList<Integer> ls = new ArrayList<>();
	for(int i=0;i<arr.length;i++)
	{
		if(ls.contains(arr[i]))
		{
			
		}
		
		else
		ls.add(arr[i]);
	}
		
	for(int i=0; i<ls.size();i++)
	{
		arr2[i] = ls.get(i);
		System.out.println(arr2[i]);
		
	}
		
	}
	
}
