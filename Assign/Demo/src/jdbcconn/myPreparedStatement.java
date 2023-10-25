package jdbcconn;

import java.sql.*;

public class myPreparedStatement {
	private static final String url = "jdbc:mysql://localhost:3306/jdbcdb";
	private static final String username = "root";
	private static final String password = "Chicha@02";
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
//			Statement statement = connection.createStatement();
			
			// insertion in db 
			/*
			String query = "INSERT INTO STUDENTS(name,age,marks) VALUES(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "Asha");
			preparedStatement.setInt(2, 23);
			preparedStatement.setDouble(3, 76);
			
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("Insertion Done");
			}else {
				System.out.println("No");
			}
			*/
			
			// retrieving data from db
			/*
			String query ="SELECT MARKS FROM STUDENTS WHERE ID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
					double marksStudent = resultSet.getDouble("marks");
					System.out.println("Marks of the student is - "+marksStudent);
			}else {
				System.out.println("Marks not found");
			}
			*/
			
			// updating in db
			
			/*
			String query = "Update students SET marks = ? where name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDouble(1, 89);
			preparedStatement.setString(2, "Asha");
			int rows = preparedStatement.executeUpdate();
			if(rows > 0) {
				System.out.println("Updation done");
			}else {
				System.out.println("No");
			}
			*/
			
			String query = "DELETE FROM STUDENTS WHERE ID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 2);
			int rows = preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("DELETION Done");
			}else {
				System.out.println("No");
			
			}	
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		}
	}