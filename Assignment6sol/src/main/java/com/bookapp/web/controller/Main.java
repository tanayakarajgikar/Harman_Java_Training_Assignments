package com.bookapp.web.controller;
import java.util.List;

import com.bookapp.model.dao.book.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;
public class Main {

	public static void main(String[] args) {
		BookService dao = new BookServiceImpl();
		List<Book> books = dao.getAllBooks();
		for(Book book: books) {
			System.out.println(book);
		}
	}
}
