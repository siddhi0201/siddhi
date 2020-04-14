package lear.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStream {

	public static List<Person> createPeople() {
		return Arrays.asList(new Person("SS", 11, "f"), new Person("Svs", 5, "f"), new Person("rk", 12, "f"),
				new Person("SV", 22, "M"));
	}

	public static void main(String args[]) {
		List<Person> people = createPeople();
		
//		List<String> names = new ArrayList<>();
//		for (Person person : people) {
//			if (person.getAge() > 11) {
//				names.add(person.getName().toUpperCase());
//			}
//		}
//		System.out.println(names);
		
		List<String> names = 
				people.stream()
				.filter(person -> person.getAge()>18)
				.map(person -> person.getName())
				.map(name -> name.toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(names);

	}

}
