package learn.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestElement {
	
	public static void main(String args[])
	{
	
	int arr[] = {2,3,1,5,6,7};
	int max = Arrays.stream(arr).max().getAsInt();
	
	System.out.println("Max element from array one" +max);
	
	List<Integer> secondList = new ArrayList<>();
	for(int i=0;i< arr.length;i++)
	{
		if(arr[i] < max)
		{
			secondList.add(arr[i]);
		}
	}
	int secondMax = Collections.max(secondList);
	System.out.println("Second maximum element is" +secondMax);
	}
}
