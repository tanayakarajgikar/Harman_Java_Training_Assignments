package com.owner.model.service;

import java.util.List;
import com.owner.model.dao.Book;
import com.owner.model.dao.BookDao;
import com.owner.model.dao.BookDaoImpl;


public class BoookServiceImpl implements BookService{

	private BookDao bookDao;
	
	public BoookServiceImpl() {
		bookDao=new BookDaoImpl();
	}


	public List<Book> getAll() {
		return bookDao.getAll();
	}

	public void addBook(Book book) {
		bookDao.addBook(book);
		
	}

	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);		
	}

	public void updateBook(int bookId, Book book) {
		bookDao.updateBook(bookId, book);
		
	}

	public Book findById(int bookId) {
		return bookDao.findById(bookId);
	}

}