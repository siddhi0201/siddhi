
class Test
{
	static int i;
	
	static
	{
		i= 10;
		System.out.println("Static Block Called");
	}
	
	Test()
	{
		System.out.println("Constructor Called");
	}
}

public class Example1 {
	
	public static void main(String args[])
	{
		 // Although we have two objects, static block is executed only once. 
		Test t1 = new Test();
		Test t2 = new Test();
	}

}
