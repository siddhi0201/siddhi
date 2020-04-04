package com.pearson.comparator;

class Movie implements Comparable<Movie>{

	private String name;
	private int rating;
	private int year;

//	suppose we want sort movies by their rating and names also.
//	When we make a collection element comparable(by having it implement Comparable),
//	we get only one chance to implement the compareTo() method. 
	@Override
	public int compareTo(Movie m) {
		return this.year - m.year;
	}
	
	
	public Movie(String name,int rating,int year)
	{
	 this.name = name;
	 this.rating = rating;
	 this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
}

