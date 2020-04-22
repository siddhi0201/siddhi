
public class PracticeSet2 {
	public static void main(String args[])
	{
		int i=0;
		int j=11;
		
		try
		{
			int result = j/i;
			System.out.println("Result is" +result);
		}
		
		
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException");
		}

		finally {
			System.out.println("Inside Finally");
		}
	}

}
