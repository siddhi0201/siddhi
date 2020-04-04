package factory.designpattern;

public class FactoryDesignPattern{
	
	public static void main(String args[])
	{
//		OperatingSystem os = new Android();
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OperatingSystem os = osf.getInstance("open");
		os.spec();
	}

}
