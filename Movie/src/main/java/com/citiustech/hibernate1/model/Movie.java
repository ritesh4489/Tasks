package com.citiustech.hibernate1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MovieData")
public class Movie {

	@Id
	private String movieId;
	@Column
	private String movieName;
	@Column
	private String language;
	@Column
	private int releasedIn;
	@Column
	private int releasedInDollars;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getReleasedIn() {
		return releasedIn;
	}

	public void setReleasedIn(int releasedIn) {
		this.releasedIn = releasedIn;
	}

	public int getReleasedInDollars() {
		return releasedInDollars;
	}

	public void setReleasedInDollars(int releasedInDollars) {
		this.releasedInDollars = releasedInDollars;
	}

	public Movie(String movieId, String movieName, String language, int releasedIn, int releasedInDollars) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
		this.releasedIn = releasedIn;
		this.releasedInDollars = releasedInDollars;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", language=" + language + ", releasedIn="
				+ releasedIn + ", releasedInDollars=" + releasedInDollars + "]";
	}

}
