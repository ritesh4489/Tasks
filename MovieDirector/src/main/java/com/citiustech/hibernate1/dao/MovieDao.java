package com.citiustech.hibernate1.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.hibernate1.model.Hollywood;
import com.citiustech.hibernate1.model.Movie;

public class MovieDao {

	public String addMovie(Movie movie) {

		Session session = getConnection();
		Transaction transaction = session.beginTransaction();

		session.save(movie);

		transaction.commit();
		session.close();
		System.out.println("Hindi Movie Added");
		return movie.getMovieId();
	}

	public String addHollywoodMovie(Hollywood hollywood) {

		Session session = getConnection();
		Transaction transaction = session.beginTransaction();

		session.save(hollywood);

		transaction.commit();
		session.close();
		System.out.println("English Movie Added");
		return hollywood.getMovieId();
	}

	public void updateMovie(String id) {
		Session session = getConnection();
		Transaction transaction = session.beginTransaction();
		Movie movie = (Movie) session.get(Movie.class, id);
		movie.setReleasedIn(11);
		session.update(movie);
		transaction.commit();
		session.close();
		System.out.println("Movie Updated");
	}

	public void deleteMovie(String id) {
		Session session = getConnection();
		session.beginTransaction();
		Movie movie = (Movie) session.get(Movie.class, id);
		session.delete(movie);
		session.getTransaction().commit();
		session.close();
		System.out.println("Movie deleted");
	}

	public Movie getMovieDetails(String id) {
		Session session = getConnection();

		Movie movie = (Movie) session.get(Movie.class, id);

		session.close();
		return movie;
	}

	public Session getConnection() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}
}
