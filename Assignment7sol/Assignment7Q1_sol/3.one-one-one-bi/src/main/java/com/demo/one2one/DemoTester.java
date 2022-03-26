package com.demo.one2one;
import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("Tanaya");
		Employee employee2=new Employee("Almas");
		Employee employee3=new Employee("Aishwarya");
		Employee employee4=new Employee("Dhanashri");
		Employee employee5=new Employee("Shruti");
		
		Parking parking1=new Parking("A1");
		Parking parking2=new Parking("B2");
		Parking parking3=new Parking("T18");
		Parking parking4=new Parking("C5");
		Parking parking5=new Parking("R45");
		
		
		parking1.setEmployee(employee1);
		parking2.setEmployee(employee2);
		parking3.setEmployee(employee3);
		parking4.setEmployee(employee4);
		parking5.setEmployee(employee5);
		
		employee1.setParking(parking1);
		employee2.setParking(parking2);
		employee3.setParking(parking3);
		employee4.setParking(parking4);
		employee5.setParking(parking5);
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		
		
		Session session = factory.openSession();// getCurrentSession (web application spring)
		
		session.getTransaction().begin();
		
		session.persist(parking1);
		session.persist(parking2);
		session.persist(parking3);
		session.persist(parking4);
		session.persist(parking5);
		
//		session.persist(employee1);
//		session.persist(employee2);
//		session.persist(employee3);
//		session.persist(employee4);
//		session.persist(employee5);
		
		session.getTransaction().commit();
		
		session.close();
		
		
		factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Spring tx*
//		Transaction tx = session.getTransaction();
//		try {
//			tx.begin();		
//			Parking parking=session.get(Parking.class, 5);
//			session.delete(parking);
//			
//			tx.commit();
//			
//		} catch (HibernateException ex) {
//			tx.rollback();
//			ex.printStackTrace();
//		}

	}

}
