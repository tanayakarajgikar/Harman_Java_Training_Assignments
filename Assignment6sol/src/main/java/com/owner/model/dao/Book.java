package com.owner.model.dao;

public class Book {

	private int bookId ;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;


	public Book(String bookName, String bookAuthor, int bookPrice) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	
	
	public Book(int bookId,String bookName, String bookAuthor, int bookPrice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public Book() {}


	

	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getBookAuthor() {
		return bookAuthor;
	}



	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}



	@Override
	public String toString() {
		return "Book [Book Id=" + bookId + ", Book Name =" + bookName + ", Book Auhtor =" + bookAuthor + ", Book Price =" + bookPrice + "]";
	}
	
	
}
