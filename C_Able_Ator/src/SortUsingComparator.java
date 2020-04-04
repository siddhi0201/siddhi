import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingComparator {
	public static void main(String args[])
	{
	List<Movie> sortedList = Arrays.asList(
			new Movie(20, "abc", 4),
			new Movie(10, "siddhi", 10),
			new Movie(14, "itika", 30),
			new Movie(19, "ritika", 60));
	
	
	
//	Comparator<Movie> c = ((o1,o2) ->
//	{
//		return o1.getName().compareTo(o2.getName());
//	});
	Collections.sort(sortedList, (o1,o2)->
	
		o1.getName().compareTo(o2.getName())
	);
	
	System.out.println(sortedList);
		
	}
}
