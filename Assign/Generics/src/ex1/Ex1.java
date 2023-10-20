package ex1;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Hari", 50000, "HR"));
        employees.add(new Employee(2, "Hema", 65000.0, "IT"));
        employees.add(new Employee(3, "John", 55000.0, "IT"));
//        employees.add("Hello");

        employees.forEach(employee -> System.out.println(employee));

	}

}
