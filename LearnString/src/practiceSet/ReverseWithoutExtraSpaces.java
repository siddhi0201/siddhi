package practiceSet;

public class ReverseWithoutExtraSpaces {

	public static void reverseArray(String str)
	{
		char[] inputArray = str.toCharArray();
		char[] result = new char[inputArray.length];
		
		//Mark Spaces in result
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i] == ' ')
			{
				result[i] = ' ';
			}
		}
		
		// Traverse input string from beginning 
        // and put characters in result from end 
		int j= result.length-1;
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]!= ' ')
			{
				if(result[j]== ' ')
				{
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
			System.out.println(String.valueOf(result));
		}
		
		
	
	
	public static void main(String args[])
	{
		reverseArray("I have a bright future");
	}
	
}
