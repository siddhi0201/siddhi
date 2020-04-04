import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOnBasisOfLastInteger {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(111);
		list.add(144);
		list.add(190);
		
//		Comparator<Integer> c = (o1,o2) ->
//		{
////			if(o1%10 > o2%10) {
////				return 1;
////			}
////			return -1;
//			return o1%10>o2%10?1:-1;
//		};
		
		Collections.sort(list, (o1,o2)->
		{
			return o1%10>o2%10?1:-1;
		});
		
	list.forEach(System.out::println);
	}
	

}
