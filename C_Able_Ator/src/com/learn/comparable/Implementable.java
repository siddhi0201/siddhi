package com.learn.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Implementable
{
	
	
	public static void main(String args[])
	{
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Avengers", 8, 2019));
		list.add(new Movie("k2h2", 7, 1995));
		
		Collections.sort(list);
		
		System.out.println("Movies after sorting..........");
		for(Movie m : list)
		{
			System.out.println(m.getName() + " " +m.getRating() + " " +m.getYear());
		}
	}
}