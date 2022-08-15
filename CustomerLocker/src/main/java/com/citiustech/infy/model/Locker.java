package com.citiustech.infy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Locker {

	@Id
	private int lockerID;
	private String lockerType;
	private int rent;

	public int getLockerID() {
		return lockerID;
	}
	public void setLockerID(int lockerID) {
		this.lockerID = lockerID;
	}
	public String getLockerType() {
		return lockerType;
	}
	public void setLockerType(String lockerType) {
		this.lockerType = lockerType;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public Locker(int lockerID, String lockerType, int rent) {
		super();
		this.lockerID = lockerID;
		this.lockerType = lockerType;
		this.rent = rent;
	}
	public Locker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
