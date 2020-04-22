package work.on.stream;

import java.util.Arrays;
import java.util.List;

public class Learn_Stream {
	
	//lambda expressions are anonymous functions
	
	public static void main(String args[])
	{
		
		//external Iterator(having a root dog at home you say move and it doesn't move,you have to push it
		//again and again have to do all by yourself
		
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
//		for(int i=0; i<ls.size();i++)
//		{
//			System.out.println(ls.get(i));
//		}
		
//		for(Integer i: ls)
//		{
//			System.out.println(i);
//		}
		
		//Internal Iterator(what to do rather than how to do)
//		ls.forEach(new Consumer<Integer>() {
//		//Anonymous inner class
//			@Override
//			public void accept(Integer value) {
//				System.out.println(value);
//			}
//		});
		
//		ls.forEach((Integer value) -> System.out.println(value));
		ls.forEach(value -> System.out.println(value));
		
		
	}

}
