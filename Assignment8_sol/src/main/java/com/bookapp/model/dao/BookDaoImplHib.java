package com.bookapp.model.dao;

import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BookDaoImplHib implements BookDao{
	private SessionFactory factory;
	public BookDaoImplHib() {
		factory=HibernateConnectionFactory.getSessionFactory();
		
	}

	public List<Book> getAll() {
		Session session =factory.openSession();
		List<Book>books=session.createQuery("Select b from Book b",Book.class).getResultList();
		
		session.close();
		return books;
		
	}

	
    public void addBook(Book book) {
		Session session =factory.openSession();
		
		org.hibernate.Transaction tx=session.getTransaction();
		try {
			tx.begin();
			session.save(book);
			tx.commit();
			
		} catch ( HibernateException ex) {
		        tx.rollback();
		        ex.printStackTrace();
			
		}
		session.clear();
		
		
	}

	public Book delBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book updateBook(int id, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
