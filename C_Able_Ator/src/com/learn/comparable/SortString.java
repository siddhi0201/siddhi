package com.learn.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortString implements Comparable<String>{

	
	public static void main(String args[])
	{
		List<String> sort = Arrays.asList("siddhi","saxena","ashirwad","rishi","priyanka","neeva");
		
		Collections.sort(sort);
		
		System.out.println(sort);
	}

	

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
