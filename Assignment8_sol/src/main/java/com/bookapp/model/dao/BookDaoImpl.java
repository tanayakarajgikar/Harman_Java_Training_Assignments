package com.bookapp.model.dao;
import java.util.*;
import java.sql.*;

public class BookDaoImpl implements BookDao {
	public Connection connection;
	

	public BookDaoImpl() {
		connection=ConnectionFactory.getConnection();
		
	}
	public List<Book> getAll() {
		List<Book> books=new ArrayList<Book>();
		Book tempBook=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from books");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				tempBook=new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
				books.add(tempBook);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
	}

	public void addBook(Book book) {
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into books(title,author,price) values(?,?,?)");
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			
		}

}

	public Book delBook(int id) {
		Book bookToBeDeleted = getBookById(id);
		try {
			String delete_book_by_id="delete from books where id=?";
			PreparedStatement pstmt= connection.prepareStatement(delete_book_by_id);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bookToBeDeleted;
	}

	public Book updateBook(int id, double price) {
Book bookToBeUpdated = getBookById(id);// if book is not found it throws the ex: BookNotFoundEx
		
		try {
			String update_book_query=
			"update books set price=? where id=?";
			PreparedStatement pstmt=connection.prepareStatement(update_book_query);
			pstmt.setDouble(1, price);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DataAccessException(ex.getMessage());
		}
		bookToBeUpdated.setPrice(price);
		
		return bookToBeUpdated;
		
	}

	public Book getBookById(int id) {
		Book book=null;
		try {
			String get_book_by_id="select * from books where id=?";
			PreparedStatement pstmt= connection.prepareStatement(get_book_by_id);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				book=new Book(rs.getInt("id") , rs.getString("title"),
						rs.getString("author"),  rs.getDouble("price"));
			}else {
				throw new BookNotFoundException("book with id "+ id +" is not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return book;
		
	}

}
