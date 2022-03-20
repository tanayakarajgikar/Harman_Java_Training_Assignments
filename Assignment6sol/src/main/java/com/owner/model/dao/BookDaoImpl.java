package com.owner.model.dao;

import java.sql.*;
import java.util.*;
import com.owner.factory.ConnectionFactory;
import com.owner.model.exception.BookNotFoundException;

public class BookDaoImpl implements BookDao {

	private Connection connection;

    public BookDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	public List<Book> getAll() {
		Book tempBook = null;
		List<Book> books = new ArrayList<Book>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");

			while (rs.next()) {
				tempBook = new Book(rs.getInt("book_id"), rs.getString("book_name"), rs.getString("book_author"), rs.getInt("book_price"));
				books.add(tempBook);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	public void addBook(Book book) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("insert into book(book_name, book_author, book_price) values(?,?,?)");
			stmt.setString(1, book.getBookName());
			stmt.setString(2, book.getBookAuthor());
			stmt.setInt(3, book.getBookPrice());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBook(int bookId) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("delete from book where book_id=?");
			stmt.setInt(1, bookId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateBook(int bookId, Book book) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement("update book set book_price = ? where book_id=?");
			stmt.setInt(1, book.getBookPrice());
			stmt.setInt(2, bookId);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public Book findById(int bookId) {
		Book tempBook = null;
		try {
			PreparedStatement stmt = 
					connection.prepareStatement("select * from book where book_id=?");
			stmt.setInt(1, bookId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				tempBook =new Book(rs.getInt("book_id"), rs.getString("book_name"), rs.getString("book_author"), rs.getInt("book_price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(tempBook==null)
			throw new BookNotFoundException("Book with id "+ bookId +" is not found");
		return tempBook;
	}
   
}




