package com.citiustech.infy.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Customer {

	@Id
	private int customerID;
	private String customerName;
	private Date dateOfBirth;
	private String address;
	private String mobileNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="locker_ID")
	private Locker locker;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Locker getLocker() {
		return locker;
	}
	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	public Customer(int customerID, String customerName, Date dateOfBirth, String address, String mobileNumber,
			Locker locker) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.locker = locker;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
