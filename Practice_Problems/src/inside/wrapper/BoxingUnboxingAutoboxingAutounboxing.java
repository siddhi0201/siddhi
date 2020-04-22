package inside.wrapper;

public class BoxingUnboxingAutoboxingAutounboxing {
	
	public static void main(String args[])
	{
		int i= 10; //Single Value Container
		
		Integer iRef = new Integer(i); //Boxed(Constructing an Object)
		
		int j = iRef.intValue(); //Unboxing (Extracting value from Object)
		
		
		
	}

}
