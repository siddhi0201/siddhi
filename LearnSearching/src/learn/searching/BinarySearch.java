package learn.searching;

public class BinarySearch {
	public int binarySearch(int arr[], int x,int n)
	{
		int start = 0;
		int end = n-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(x == arr[mid])
				return mid;
			else if (x < arr[mid]) {
				end = mid -1;
			}
			else
				start = mid+1;
		}
		return -1;
	}

	public static void main(String args[])
	{
		BinarySearch search = new BinarySearch();
		int arr[] = {2,6,13,21,36,47,63,81,97};
		int x =81;
		int n = arr.length-1;
		int result = search.binarySearch(arr, x, n);
		 if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result); 
	    } 
				
	
}
