package practiceSet;

public class FindDuplicate {
	
	public static void main(String args[])
	{
		String s = "Siddhi";
		char String[] = s.toCharArray();
		 //Counts each character present in the string  
		for(int i=0 ; i<s.length(); i++)
			
		{
			  int count = 1;
			for(int j=i+1; j<s.length();j++)
			{
				if(String[i]==String[j])
				{
					count++;
					String[j] = 0;
				}
			}
			 if(count > 1 && String[i] != '0')
				System.out.println(String[i]);
			}
		}
	}


