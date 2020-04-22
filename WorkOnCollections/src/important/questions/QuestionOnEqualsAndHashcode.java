package important.questions;

import java.util.HashMap;

public class QuestionOnEqualsAndHashcode {
	
	public static void main(String args[])
	{
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
//		System.out.println(emp1.id);
//		System.out.println(emp2.id);
	
		
		//Example1
		HashMap<Employee,String> map1 = new HashMap<>();
		map1.put(emp1, "siddhi");
		map1.put(emp2, "siddhi");
		
		System.out.println(map1);
		System.out.println(map1.size());
		
		//Example2
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		
		HashMap<Integer,String> map2 = new HashMap<>();
		map2.put(i1, "saxena");
		map2.put(i2, "saxena");
		
		System.out.println(map2);
		System.out.println(map2.size());
		
		
	}

}

class Employee
{
	int id;
	
	public Employee(int id)
	{
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
