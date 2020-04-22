package about.interfaces;

public class ImplementInterfaces implements Interface1,Interface2{

	@Override
	public void getApple() {
		System.out.println("heyoo");
		
	}
	
	public static void main(String args[])
	{
		ImplementInterfaces ii = new ImplementInterfaces();
		ii.getApple();
	}

}
