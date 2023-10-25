package lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Hema", "Sri", 60),
				new Person("Sai", "Nath", 78),
				new Person("Ravi", "Kumar", 27),
				new Person("Bhavitha", "Sattaru", 45),
				new Person("Rohith", "Meesala", 34)
				);
		// 1. Sort list by the last Name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.lastName.compareTo(o2.lastName);
			}

		});
		
		// 2. Create method to print all elements in the list
		printAll(persons);
		
		// 3. Create method that prints all people that have last name starting with S
		printLastNameBeginnningWithS(persons);
	}

	private static void printLastNameBeginnningWithS(List<Person> persons) {
		for(Person p : persons) {
			if(p.getLastName().startsWith("S")) {
			System.out.println(p);}
		}
	}

	private static void printAll(List<Person> persons) {
		for(Person p : persons) {
			System.out.println(p);
		}
	}
}
