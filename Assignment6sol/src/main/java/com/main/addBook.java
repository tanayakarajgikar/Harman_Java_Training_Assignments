package com.main;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;


public class addBook {
		
		public static void main(String[] args) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			PreparedStatement stmt=null;
			Connection connection=null;
			
			try {
				 connection=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/bookstore", "book", "book");
				
				stmt=connection.
						prepareStatement("insert into book(book_id, book_name, book_author, book_price) values(?,?,?,?)");
				
				stmt.setInt(1, 1005);
				stmt.setString(2, "The Secret");
				stmt.setString(3, "Ronda Berny");
				stmt.setInt(4, 580);
				
				int noOfRowsEffected= stmt.executeUpdate();
				System.out.println(noOfRowsEffected);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(connection!=null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			
			
		}

	}

	
	

