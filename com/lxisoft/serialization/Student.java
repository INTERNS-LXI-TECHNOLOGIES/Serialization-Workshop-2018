package com.lxisoft.serialization;
import java.io.Serializable;
//import com.lxisoft.serialization.Address;

public class Student {
	
	private int id;
	private String name;
	//private Address address;
	
	public Student(int id, String name){
		this.id=id;
		this.name=name;
		//this.address=address;
	}	

	@Override
	public String toString(){
		return(id+name);
	}

}