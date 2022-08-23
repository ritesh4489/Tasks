package com.citiustech.hibernate1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.hibernate1.dao.MovieDao;
import com.citiustech.hibernate1.model.Director;
import com.citiustech.hibernate1.model.Hollywood;
import com.citiustech.hibernate1.model.Movie;

public class App {
	public static void main(String[] args) {
		MovieDao movieDao = new MovieDao();
		Scanner scanner = new Scanner(System.in);
//    	Add Movie
		
		System.out.println("Enter Movie  ID");
		String mid = scanner.next();

		System.out.println("Enter Movie Name");
		String mname = scanner.next();

		System.out.println("Enter Movie Language");
		String mlang = scanner.next();

		System.out.println("Enter Movie Released Date");
		int rDate = scanner.nextInt();

		System.out.println("Enter Movie Relesead Dollor");
		int releasedDollar = scanner.nextInt();

		System.out.println("Enter Movie Director ID");
		String did = scanner.next();

		System.out.println("Enter Movie Director Name");
		String dname = scanner.next();

		System.out.println("Enter Movie Director born in ");
		int dborn = scanner.nextInt();

		Director director = new Director();
		director.setDirectorId(did);
		director.setDirectorName(dname);
		director.setBornIn(dborn);

		if (mlang.equalsIgnoreCase("hindi")) {
			Movie movie = new Movie ();
			movie.setMovieId(mid);
			movie.setMovieName(mname);
			movie.setLanguage(mlang);
			movie.setReleasedIn(rDate);
			movie.setReleasedInDollars(releasedDollar);
			movie.setDirector(director);
			movieDao.addMovie(movie);
		} else if (mlang.equalsIgnoreCase("english")) {
			Hollywood hollywood = new Hollywood();
			hollywood.setMovieId(mid);
			hollywood.setMovieName(mname);
			hollywood.setLanguage(mlang);
			hollywood.setReleasedIn(rDate);
			hollywood.setReleasedInDollars(releasedDollar);
			hollywood.setDirector(director);
			movieDao.addHollywoodMovie(hollywood);
		}
		
//      Update movie
//    	System.out.println("Enter Movie ID");
//    	String mid  = scanner.next();
//        movieDao.updateMovie(mid);
//
//      Delete Movie
//    	System.out.println("Enter Movie ID");
//    	String moid  = scanner.next();
//        movieDao.deleteMovie(moid);
//        
//      get movie by Id
//    	System.out.println("Enter Movie ID");
//    	String movid  = scanner.next();
//        Movie getmovie=movieDao.getMovieDetails(movid);
//        System.out.println(getmovie);
	}
}
