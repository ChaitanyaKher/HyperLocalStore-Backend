package com.hyperlocalstore.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store_details")
public class storeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "store_name")
	private String storeName;
	@Column(name = "area")
	private String area;
	@Column(name = "pincode")
	private String pincode;
	@Column(name = "latitude")
	private float latitude;
	@Column(name = "longitude")
	private float longitude;
	
	public storeModel() {
		
	}
	
	public storeModel(String storeName, String area, String pincode, float latitude, float longitude) {
		super();
		this.storeName = storeName;
		this.area = area;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
}
