package com.learn.comparable;

public class Student implements Comparable<Student>{
	
	private Integer id;
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String name;
	
	public Student(Integer id,String name) {
		super();
		this.id = id;
		this.name = name;
		
	}

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student o) {
		if(this.getId() > o.getId())
		{
		return 1;
		}
		return -1;
	}
	
	
	
}
