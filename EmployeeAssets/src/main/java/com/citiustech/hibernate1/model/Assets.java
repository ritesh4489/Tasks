package com.citiustech.hibernate1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Assets_Assignment5")
public class Assets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int assetId;
	private int serialNo;
	private int prNo;
	private String assetType;
	private int assetprice;
	private String assetLocation;
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public int getPrNo() {
		return prNo;
	}
	public void setPrNo(int prNo) {
		this.prNo = prNo;
	}
	public String getAssetType() {
		return assetType;
	}
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}
	public int getAssetprice() {
		return assetprice;
	}
	public void setAssetprice(int assetprice) {
		this.assetprice = assetprice;
	}
	public String getAssetLocation() {
		return assetLocation;
	}
	public void setAssetLocation(String assetLocation) {
		this.assetLocation = assetLocation;
	}
	public Assets() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Assets [assetId=" + assetId + ", serialNo=" + serialNo + ", prNo=" + prNo + ", assetType=" + assetType
				+ ", assetprice=" + assetprice + ", assetLocation=" + assetLocation + "]";
	}
	
	
}
