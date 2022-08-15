package com.citiustech.inox;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Movie ID");
			int movieID = scanner.nextInt();
			System.out.println("Enter No of Tickets");
			int noofTickets = scanner.nextInt();

			BookMyMovie bookMyMovie = new BookMyMovie(movieID, noofTickets);
			double amount = bookMyMovie.calculateTicketAmount(bookMyMovie);

			System.out.println("Total Amount for Booking = " + amount);
		}
	}
}
