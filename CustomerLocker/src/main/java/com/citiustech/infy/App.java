package com.citiustech.infy;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.citiustech.infy.model.Customer;
import com.citiustech.infy.model.Locker;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
       Configuration configuration =  new Configuration();
       configuration.configure("hibernate.cfg.xml");
       
       SessionFactory sessionFactory=configuration.buildSessionFactory();
       
       Session session = sessionFactory.openSession();
       
       session.beginTransaction();
       
       Customer customer =  new Customer();
       customer.setCustomerID(1002);
       customer.setCustomerName("william");
       customer.setDateOfBirth(new java.sql.Date(1997, 8, 07));
       customer.setAddress("USA");
       customer.setMobileNumber("88888888888");
       
       Locker locker =  new Locker();
       locker.setLockerID(102);
       locker.setLockerType("small");
       locker.setRent(50000);
       
       customer.setLocker(locker);
       
       session.save(customer);
       
       session.getTransaction().commit();
       session.close();
    }
}
