package com.citiustech.hibernate1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.hibernate1.dao.MovieDao;
import com.citiustech.hibernate1.model.Movie;

public class App 
{
    public static void main( String[] args )
    {   
    	MovieDao movieDao =  new MovieDao();
    	Scanner scanner =  new Scanner(System.in);
//    	Add Movie
//    	System.out.println("Enter Movie ID");
//    	String id  = scanner.next();
//    	
//    	System.out.println("Enter Movie Name");
//    	String mname  = scanner.next();
//    	
//    	System.out.println("Enter Movie Language");
//    	String mlang  = scanner.next();
//    	
//    	System.out.println("Enter Movie Released Date");
//    	int rDate  = scanner.nextInt();
//    	
//    	System.out.println("Enter Movie Relesead Dollor");
//    	int releasedDollar  = scanner.nextInt();
//    	
//        Movie movie = new Movie(id,mname,mlang,rDate,releasedDollar);
//        movieDao.addMovie(movie);
        
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
    	System.out.println("Enter Movie ID");
    	String movid  = scanner.next();
        Movie getmovie=movieDao.getMovieDetails(movid);
        System.out.println(getmovie);
    }
}
