
public class MakeSingleton {

//volatile makes it thread safe in multithreaded environment
	private static /*volatile*/ MakeSingleton single_Instance = null;
	
	public String s;
	
	private MakeSingleton()
	{
		s = "Hey Siddhi";
	}

	
	public static MakeSingleton get_Instance()
	{
//		synchronized(MakeSingleton.class)
//		{
		if(single_Instance == null)
			single_Instance = new MakeSingleton();
//		}
		return single_Instance;
	}
	
	
	
}
