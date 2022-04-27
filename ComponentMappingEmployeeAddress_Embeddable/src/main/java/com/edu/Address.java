package com.edu;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(length=30)
private String City;
	@Column(length=30)
private String State;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	public Address(String City, String State) {
		super();
		this.City=City;
		this.State=State;
	}
	
	public Address() {
		super();
	}
	
	@Override
	public String toString() {
		return "Address [City=" + City + ", State=" + State + "]";
	}

}
