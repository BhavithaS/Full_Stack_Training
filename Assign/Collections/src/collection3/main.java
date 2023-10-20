package collection3;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Enter you choice");
		System.out.println("1.Id 2.Name 3.Department 4.Salary");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice == 1) {
			Set<Employee> employees = new TreeSet<Employee>();
			employees.add(new Employee(1, "Hari", "IT", 45000));
			employees.add(new Employee(5, "Ravi", "IT", 25000));
			employees.add(new Employee(7, "Hema", "IT", 75000));
			employees.add(new Employee(2, "Bhanu", "IT", 40000));
			employees.add(new Employee(10, "Anu", "IT", 46800));
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}
		}else if(choice == 2) {
			Comparator<Employee> comparator = new Comparator<Employee>() {
				
				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			};
			Set<Employee> employees = new TreeSet<Employee>(comparator);
			employees.add(new Employee(1, "Hari", "IT", 45000));
			employees.add(new Employee(5, "Ravi", "IT", 25000));
			employees.add(new Employee(7, "Hema", "IT", 75000));
			employees.add(new Employee(2, "Bhanu", "IT", 40000));
			employees.add(new Employee(10, "Anu", "IT", 46800));
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}
		}else if(choice == 3) {
			Comparator<Employee> comparator = new Comparator<Employee>() {
				
				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return o1.getDepartment().compareTo(o2.getDepartment());
				}
			};
			Set<Employee> employees = new TreeSet<Employee>(comparator);
			employees.add(new Employee(1, "Hari", "IT", 45000));
			employees.add(new Employee(5, "Ravi", "Finance", 25000));
			employees.add(new Employee(7, "Hema", "HR", 75000));
			employees.add(new Employee(2, "Bhanu", "IT", 40000));
			employees.add(new Employee(10, "Anu", "Testing", 46800));
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}
		}else {
			Comparator<Employee> comparator = new Comparator<Employee>() {
				
				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					if(o1.getSalary() > o2.getSalary()) {
						return 1;
					}else {
						return -1;
					}
				}
			};
			Set<Employee> employees = new TreeSet<Employee>(comparator);
			employees.add(new Employee(1, "Hari", "IT", 45000));
			employees.add(new Employee(5, "Ravi", "Finance", 25000));
			employees.add(new Employee(7, "Hema", "HR", 75000));
			employees.add(new Employee(2, "Bhanu", "IT", 40000));
			employees.add(new Employee(10, "Anu", "Testing", 46800));
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}
		}
		scanner.close();

	}

}
