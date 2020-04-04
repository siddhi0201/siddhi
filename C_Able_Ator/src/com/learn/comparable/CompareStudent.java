package com.learn.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudent {
	public static void main(String args[])
	{

	List<Student> entries = new ArrayList<>();
	
	entries.add(new Student(150,"siddhi"));
	entries.add(new Student(120, "saxena"));
	
	Collections.sort(entries);
	
//	entries.forEach(s -> System.out.println(s));
	
	for(Student s: entries)
	{
		System.out.println(s);
	}
	}

}
