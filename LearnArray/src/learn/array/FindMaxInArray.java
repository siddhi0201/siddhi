package learn.array;

import java.util.Arrays;

public class FindMaxInArray {
	public static void main(String args[])
	{
	int[] arr = {10,20,-1,-3,1,10000};
	int max = Arrays.stream(arr).max().getAsInt();
	System.out.println("Maximum number is" +max);
	}
}
