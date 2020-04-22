public class StringToInteger {
	
	public static void main(String args[])
	{
		
		String str = "1234";
		int val = convert(str);
		System.out.println(val);
		
		str = "1234s";
		val = convert(str);
		System.out.println(val);
		
	}
	
	public static int convert(String str)
	{
		Integer val =0;
		try
		{
	val = Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid String");
		}
		
	return val;
	}

}
