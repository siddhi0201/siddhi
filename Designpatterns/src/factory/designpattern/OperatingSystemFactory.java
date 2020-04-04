package factory.designpattern;

public class OperatingSystemFactory {
	
	public OperatingSystem getInstance(String str)
	{
		if(str.endsWith("open"))
		{
			return new Android();
		}
		else
			return new Ios();
	}

}
