package com.lxisoft.defaultWriteObject;

public class Address{

	private String house;

	
	public Address(String house){
		this.house=house;
	}
	
	public String getHouse(){
		return house;
	}
	
	@Override
	public String toString(){
		return house;
	}

}