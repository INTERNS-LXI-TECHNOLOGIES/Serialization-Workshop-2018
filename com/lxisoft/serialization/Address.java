package com.lxisoft.serialization;
import java.io.Serializable;

public class Address implements Serializable{

	private String house;
	private String place;
	
	public Address(String house, String place){
		this.house=house;
		this.place=place;
	}
	
	@Override
	public String toString(){
		return(house+place);
	}

}