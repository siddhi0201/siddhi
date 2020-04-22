import java.util.ArrayList;

public class PracticeSet4 {

	
	public static void main(String args[])
	{
		int arr[] = {1,3,4,2,1,4,5,6,7,7};
		
		int arr2[] = new int[arr.length]; 
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(list.contains(arr[i]))
			{
				
			}
			
			else
				list.add(arr[i]);
		}
		
		
		for(int i=0; i<list.size();i++)
		{
			arr2[i] = list.get(i);
			System.out.println(arr2[i]);
		}
	}
}
