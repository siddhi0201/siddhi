package learn.array;

public class TwoSum {
	
	public static void main(String args[])
	{
	int[] arr = {10,20,-1,-3,1};
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == 30)
				{
					System.out.println("Indexes and numbers whose sum is highest are" +i +" " +j 
							+" " 
				+arr[i] +" " +arr[j]);
				}
				else
					continue;
			}
		}
	}
	}

