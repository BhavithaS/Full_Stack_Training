package hashmapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
	int id;
	String name;
	public Student(int id, String string) {
		super();
		this.id = id;
		this.name = string;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}

public class Students2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Student, Integer> studentRecords = new HashMap<>();
		int id = 1;
		studentRecords.put(new Student(id++,"Alice"),76);
		studentRecords.put(new Student(id++,"John"),45);
		studentRecords.put(new Student(id++,"Alice"),68);
		studentRecords.put(new Student(id++,"Eve"),55);
		studentRecords.put(new Student(id++,"Alice"),97);
		studentRecords.put(new Student(id++,"Bob"),57);
		studentRecords.put(new Student(id++,"John"),86);
		
		System.out.println("Enter the student name");
		String studentName = sc.next();
		System.out.println("Enter the student id");
		int stuId = sc.nextInt();
		
		for(Map.Entry<Student, Integer> entry : studentRecords.entrySet()) {
			Student s = entry.getKey();
			int studentID = s.getId();
			String stuName = s.getName();
			if(studentName.equals(stuName) && (studentID==stuId)) {
				int marks = entry.getValue();
				System.out.println("Name : "+stuName+" and Id : "+ studentID + " Marks : "+marks);
			}
		}
		sc.close();
		
	}
}
