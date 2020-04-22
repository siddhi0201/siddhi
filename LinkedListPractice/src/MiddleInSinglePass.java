import java.util.LinkedList;

public class MiddleInSinglePass {

	
	public static void main(String args[])
	{
		
		LinkedList<String> list = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
//		
//		list.forEach(s -> {
//			
//			System.out.println(s);
//		});
		 
		int count = 0;
		for(String s: list)
		{
			int size =  (s.length())/2;
			System.out.println(size);
		}
	
	}
}
