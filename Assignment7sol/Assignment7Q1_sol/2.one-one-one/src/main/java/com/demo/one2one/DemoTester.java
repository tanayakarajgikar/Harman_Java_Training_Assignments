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
		Employee employee4=new Employee("kDhanashri");
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
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();
		Session session = factory.openSession();// getCurrentSession (web application spring)
		
		//select p from Parking p
		List<Parking>parkings=session
				.createQuery("from Parking p join fetch p.employee Employee").getResultList();
		System.out.println("------------------------------------");
		for(Parking parking : parkings) {
			System.out.println(parking);
			//System.out.println(parking.getEmployee());
		}
		
		session.close();
		
		for(Parking parking : parkings) {
			System.out.println(parking.getEmployee());
		}
		
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
