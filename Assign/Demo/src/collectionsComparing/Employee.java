package collectionsComparing;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	public int id;
	private String name;
	private int salary;
	private String dept;
	
	
	public Employee(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(5,"HARISH",45000,"IT"));
		employees.add(new Employee(2, "ASHA", 60000, "CSE"));
		employees.add(new Employee(7, "Ravi", 35000, "MECH"));
		System.out.println(employees);
//		Collections.sort(employees, new Compares());
//		System.out.println(employees);
		Collections.sort(employees, new NameCompare());
		System.out.println(employees);

		
		
		
	}

}
