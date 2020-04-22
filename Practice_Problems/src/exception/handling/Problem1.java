package exception.handling;

public class Problem1 {
	
	public static int m1()
	{
	try
	{
		return 1;
	}
	catch(Exception e1)
	{
		return 2;
	}
	finally
	{
		return 3;
	}
	}
	public static void main(String args[])
	{
		int x = m1();
		System.out.println("value of m1" +x);
	}

}
