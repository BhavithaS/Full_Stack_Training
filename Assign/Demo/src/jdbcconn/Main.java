package jdbcconn;

import java.sql.*;
import java.util.Scanner;

public class Main {
	private static final String url = "jdbc:mysql://localhost:3306/jdbcdb" ;
	private static final String username = "root";
	private static final String password = "Chicha@02";
	
	public static void main(String[] args) {
		try {
			// loading drivers from mysql cj package
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		 try {
			
			// making connection
			Connection connection = DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement();
			
			
			
			// retrieving data from DB
			/*
			String query ="SELECT * From jdbcdb.employee;";
			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				int id = resultSet.getInt(1); 
				String name = resultSet.getString(2);
				int age = resultSet.getInt(3);
				double salary = resultSet.getDouble(4);
				System.out.println("ID : "+id);
				System.out.println("Name : "+name);
				System.out.println("Age : "+age);
				System.out.println("Salary : "+salary);
				
				}*/
			
			// inserting into db
			
//			String query ="INSERT INTO jdbcdb.employee(name,age,salary) VALUES(\"Rekha\",23,56000);";
			/*
			String query = String.format("INSERT INTO jdbcdb.employee(name,age,salary) VALUES('%s',%o,%f)","Rekha",23,56000.0);
			int rowsAffected = statement.executeUpdate(query);
			if(rowsAffected>0) {
				System.out.println("Data inserted");
			}else {
				System.out.println("Data not inserted");
			}
			*/
			
			// updating the db
			/*
			String query = String.format("UPDATE jdbcdb.employee SET age = %d WHERE id = %d ", 36, 2);
			int rowsAffected = statement.executeUpdate(query);
			if(rowsAffected>0) {
				System.out.println("Data Updated");
			}else {
				System.out.println("Data not Updated");
			}
			*/
			
			// deleting in database
			
			/*
			 String query = "DELETE FROM jdbcdb.employee WHERE ID = 3";
			 
			int rowsAffected = statement.executeUpdate(query);
			if(rowsAffected>0) {
				System.out.println("Data Deleted");
			}else {
				System.out.println("Data not Deleted");
			}
			*/
			
			// for processing multiple insert queries
			
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.println("Enter the name of employee");
				String name = scanner.next();
				System.out.println("Enter the age of employee");
				int age = scanner.nextInt();
				System.out.println("Enter the salary of employee");
				double salary = scanner.nextDouble();
				System.out.println("Enter more data? (y/n)");
				String choice = scanner.next();
				String query = String.format("INSERT INTO employee(name,age,salary) VALUES('%s',%d,%f)",name,age,salary);
				statement.addBatch(query);
				if(choice.equals("n")) {
					break;
				}
				int[] arr= statement.executeBatch();
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==0) {
						System.out.println("No value stored");
					}else {
						System.out.println("Value Stored");
					}
				}
				
			}
			
			
			scanner.close();
				
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		 
		
		
	}
	}
