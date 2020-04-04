package methodOverloadingRiding;

public class Question2 {

	
	public static void main(String args[])
	{
		//in case of all the three
//		test(null); // this will give compilation error as it is not able t decide which one to go for 
		//integer or string
		//in case we comment the integer block it will return call string
		//because string is more specific than object...
		
//		test(null);
	}
	
	public static void test(Object obj)
	{
		System.out.println("call object");
		
	}


public static void test(String str)
{
	System.out.println("call string");
}

public static void test(Integer in)
{
	System.out.println("call integer");
}
}