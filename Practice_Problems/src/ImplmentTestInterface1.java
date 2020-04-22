
public class ImplmentTestInterface1 implements TestInterface1{

	public static void main(String args[])
	{
	
		ImplmentTestInterface1 ti1 = new ImplmentTestInterface1();
		ti1.heySiddhi();
	
	ti1.show();
	System.out.println(ti1);
	}
	@Override
	public void heySiddhi() {
		System.out.println("siddhi");
	}
	
	
}
