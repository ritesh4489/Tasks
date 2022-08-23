package com.citiustech.hibernate1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Directors")
public class Director {

	@Id
	private String directorId;
	private String directorName;
	private int bornIn;
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getBornIn() {
		return bornIn;
	}
	public void setBornIn(int bornIn) {
		this.bornIn = bornIn;
	}
	public Director(String directorId, String directorName, int bornIn) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.bornIn = bornIn;
	}
	public Director(String dname, int dborn) {
		super();
		// TODO Auto-generated constructor stub
	}
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	
}
