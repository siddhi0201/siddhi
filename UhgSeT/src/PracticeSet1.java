import java.util.Scanner;

public class PracticeSet1 {
	//Remove alternate elements from array starting from index 0 
	//till only one element is left in the array and display that element
	
//	 public static int removeAlternate(int n)
//	    {
//	        if (n == 1) 
//	            return 1;
//	  
//	        if (n % 2 == 0) 
//	            return 2 * removeAlternate(n / 2) - 1;
//	        else
//	            return 2 * removeAlternate(((n - 1) / 2)) + 1;
//	    }  	
//	      
//	    public static void main(String[] args) 
//	    { 
//	        int n = 5;
////	        System.out.print(removeAlternate(n));
//	        n = 10;
//	        System.out.print("\n"+removeAlternate(n));
//	    } 
	
	public static void main(String args[])
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i< 5;i++)
		{
			arr[i] = sc.nextInt();
			
		}
	}
	
}
