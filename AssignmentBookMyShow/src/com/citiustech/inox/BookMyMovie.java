package com.citiustech.inox;

public class BookMyMovie {

	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	public BookMyMovie(int movieId, int noOfTickets) {
		super();
		this.movieId = movieId;
		this.noOfTickets = noOfTickets;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void calculateDiscount(int movieId,int noOfTickets) {
		if((movieId==101 || movieId==102 || movieId==103) && noOfTickets<5 ) {
			discount = 0;
		}
		else if((movieId==101 || movieId==103) && (noOfTickets<=10 && noOfTickets>=5)){
			discount = 15;
		}
		else if((movieId==101 || movieId==103) && (noOfTickets<=15 && noOfTickets>=10) ) {
			discount = 20;
		}
		else if(movieId==102 && (noOfTickets<=10 && noOfTickets>=5) ) {
			discount = 10;
		}
		else if(movieId==102 && (noOfTickets<=15 && noOfTickets>=10) ) {
			discount = 15;
		}
		else {
			System.out.println("Sorry! Invalid Movie ID! /n Please check the Movie ID and enter once again");
		}
		
	}
	
	public double calculateTicketAmount(BookMyMovie bookMyMovie) {
		
		calculateDiscount(bookMyMovie.getMovieId(), bookMyMovie.getNoOfTickets());
		
		double baseFare=0;
		
		if (bookMyMovie.getMovieId() == 101) {
			baseFare = 120;
		} 
		else if (bookMyMovie.getMovieId() == 102) {
			baseFare = 170;
		} 
		else if (bookMyMovie.getMovieId() == 103) {
			baseFare = 150;
		} 
		else {
			System.out.println("Invalid ID");
		} 
		
		totalAmount = baseFare * bookMyMovie.getNoOfTickets() - (baseFare * bookMyMovie.getNoOfTickets() * (discount/100));
				
		return totalAmount;
	}
	
}
