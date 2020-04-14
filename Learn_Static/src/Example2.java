
class Test1
{
	static int i;
	
	static
	{
		i = 10;
		System.out.println("Static Block Called");
	}
	
	Test1()
	{
		System.out.println("Constructor Called");
	}
}

public class Example2 {

	public static void main(String args[])
	{
		 // Although we don't have an object of Test, static block is  
        // called because i is being accessed in following statement. 
		System.out.println(Test1.i);
	}
	
}
