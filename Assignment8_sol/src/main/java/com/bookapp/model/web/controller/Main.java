package com.bookapp.model.web.controller;

import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;

public class Main {
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		//Book book = new Book("The secret","abc",450);
		/*
		 * bookService.addBook(book); System.out.println("BookAdded");
		 */
		
		  List<Book> books=bookService.getAll(); 
		  for(Book book: books) {
		  System.out.println(book);		 
		}
}
}
