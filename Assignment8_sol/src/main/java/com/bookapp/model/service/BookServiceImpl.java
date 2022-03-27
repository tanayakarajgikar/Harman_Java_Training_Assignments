package com.bookapp.model.service;

import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.dao.BookDao;
import com.bookapp.model.dao.BookDaoImpl;
import com.bookapp.model.dao.BookDaoImplHib;

public class BookServiceImpl implements BookService{
	private BookDao bookDao;
	public BookServiceImpl() {
		bookDao=new BookDaoImplHib();
	}
	
	
	
	public List<Book> getAll() {
		return bookDao.getAll();
	}
	
	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	public Book delBook(int id) {
		
		return bookDao.delBook(id);
	}

	public Book updateBook(int id, double price) {
		return bookDao.updateBook(id, price);
		
	}

	public Book getBookById(int id) {
		
		return bookDao.getBookById(id);
	}

}
