package learn.array;

public class ReverseArray {
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6};
		
		
		extracted(arr);
	}

	private static void extracted(int[] arr) {
		for(int i=arr.length-1;i>=0;i--)
		{
            System.out.print(" "+arr[i]); 
		}
	}

}
