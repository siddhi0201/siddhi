package practiceSet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaStringToArrayList {
	
	public static void main(String args[])
	{
		String num = "20,30,10,40,50";
		String str[] = num.split(",");
		
		List<String> list = Arrays.asList(str);
		list.sort(Comparator.naturalOrder());
		for(String stri :list)
		{
		System.out.println(stri);
		}
	}

}
