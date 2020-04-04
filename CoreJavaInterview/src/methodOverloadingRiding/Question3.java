package methodOverloadingRiding;

public class Question3 {
	
	//can we override main in java?
	
	
	public static void main(String args[])
	{
		System.out.println("call main");
	}

}

class checkStaticOverride extends Question3
{
//	@Override
	public static void main(String args[])
	{
		System.out.println("call checkStaticOverride");
	}
}