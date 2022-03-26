package com.demo.one2many;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.factory.HibernateSessionFactory;

public class DemoTester {

	public static void main(String[] args) {

//		Employee employee1=new Employee("Tanaya");
//		Employee employee2=new Employee("Almas");
//		Employee employee3=new Employee("Aishwarya");
//		Employee employee4=new Employee("Dhanashri");
//		Employee employee5=new Employee("Shruti");
		
//		Parking parking1=new Parking("A1");
//		Parking parking2=new Parking("B2");
//		Parking parking3=new Parking("T18");
//		Parking parking4=new Parking("C5");
//		Parking parking5=new Parking("R45");
//
//		department1.getEmployees().add(employee1);
//		department1.getEmployees().add(employee2);
//
//		department2.getEmployees().add(employee3);
//		department2.getEmployees().add(employee4);
//
//		department3.getEmployees().add(employee5);
//		department3.getEmployees().add(employee6);
//		department3.getEmployees().add(employee7);
//
//		employee1.setDepartment(department1);
//		employee2.setDepartment(department1);
//
//		employee3.setDepartment(department2);
//		employee4.setDepartment(department2);
//
//		employee5.setDepartment(department3);
//		employee6.setDepartment(department3);
//		employee7.setDepartment(department3);

		
//		session.persist(department1);
//		session.persist(department2);
//		session.persist(department3);
//
//		session.persist(employee1);
//		session.persist(employee2);
//		session.persist(employee3);
//		session.persist(employee4);
//		session.persist(employee5);
//		session.persist(employee6);
//		session.persist(employee7);
		
		
		
		
		SessionFactory factory = HibernateSessionFactory.getSessionFactory();

		Session session = factory.openSession();// getCurrentSession (web application spring)

//		session.getTransaction().begin();
//
//		session.getTransaction().commit();

		List<Department> departments=session
				.createQuery("select d from Department d")
				.getResultList();
		
		//Using fetch join
		
//		List<Department> departments=session
//				.createQuery("from Department d join fetch d.employees Employee")
//				.getResultList();
		
		for(Department dept:departments ) {
			System.out.println(dept);
			for(Employee e: dept.getEmployees()) {
				System.out.println(e);
			}
		}
		
		
		session.close();

		factory.close();

	}

}
