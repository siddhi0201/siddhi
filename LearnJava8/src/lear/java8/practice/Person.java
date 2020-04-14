package lear.java8.practice;

public class Person {
	
	private final String name;
	private final int age;
	private final String gender;
	
	public Person(String thename,int theage,String thegender)
	{
		name = thename;
		age = theage;
		gender = thegender;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}


}
