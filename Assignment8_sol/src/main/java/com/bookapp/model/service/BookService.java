package com.bookapp.model.service;
import java.util.List;
import com.bookapp.model.dao.Book;
public interface BookService {
	public List<Book> getAll();
	public void addBook(Book book);
	public Book delBook(int id);
	public Book updateBook(int id, double price);
	public Book getBookById(int id);

}
