package Generics;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

class Employee{
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails(){
        System.out.println("Id is : "+id);
        System.out.println("Name of Employee is : "+name);
        System.out.println("Salary is : "+salary);
        System.out.println("Department is : "+department);
    }


}

public class ex1 {
    public static void main(String[] args){
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Hari", 50000, "HR"));
        employees.add(new Employee(2, "Hema", 65000.0, "IT"));
        employees.add(new Employee(3, "John", 55000.0, "IT"));
        // employees.add(new Employee(1, "Joy", 70000.0, "Marketing"));

        employees.forEach(employee -> System.out.println(employee));
    }
    
    
}
