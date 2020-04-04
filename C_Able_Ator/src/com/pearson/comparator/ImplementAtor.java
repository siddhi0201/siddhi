package com.pearson.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ImplementAtor
{

	public static void main(String args[])
	{
	
		
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Avengers", 8, 2019));
		list.add(new Movie("k2h2", 7, 1995));
		
		CompareRating rating = new CompareRating();
		Collections.sort(list, rating);
		
		for(Movie m : list)
		{
			System.out.println("Comparision on basis of rating" + " " +m.getName() + " " +m.getRating() + " " +m.getYear());
		}
		
		CompareName name = new CompareName();
		Collections.sort(list, name);
		for(Movie m : list)
		{
			System.out.println("Comparision on basis of name" + " " +m.getName() + " " +m.getRating() + " " +m.getYear());
		}
		
	}

}
