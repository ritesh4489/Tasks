package com.citiustech.hibernate1.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.hibernate1.model.Employee;

public class EmployeeDao {

	public void create(Employee employee) {
		
		Session session = getConnection();
		Transaction transaction = session.beginTransaction();

		session.save(employee);

		transaction.commit();
		session.close();
		System.out.println("employee Added");
	}

	public void update(int id,String newpass) {
		Session session = getConnection();
		Transaction transaction = session.beginTransaction();
		Employee employee=(Employee) session.get(Employee.class,id);
		employee.setPassword(newpass);
		session.update(employee);
		transaction.commit();
		session.close();
		System.out.println("employee Updated");
	}

	public void delete(int id) {
		Session session = getConnection();
		session.beginTransaction();
		Employee employee=(Employee) session.get(Employee.class,id);
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee deleted");
	}

	public List<Employee> read() {
		Session session = getConnection();
	
		Query query = session.createQuery("from Employee");
		
		List<Employee> list= query.list();
	
		session.close();
		return list;
	}

	public Session getConnection() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
}
