package work.on.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Learn_Invoke_Dynamic {
	
	
	
	public static void main(String args[])
	{
		List<Integer> value = Arrays.asList(2,1,5,0,6);
		
//	int total =0;
//	
//	for(Integer e: value)
//	{
//		
//		total+= e*2;
//	}
//
//	System.out.println(total);
		
		System.out.println(
		value.stream()
		.map(e -> e*2)
		.reduce(0, (c,e) -> c+e)
				);
		System.out.println(value.stream().sorted().collect(Collectors.toList()));
	}
}
