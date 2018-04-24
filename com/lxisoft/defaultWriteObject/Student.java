package com.lxisoft.defaultWriteObject;
import java.io.Serializable;
import java.io.*;
import com.lxisoft.defaultWriteObject.Address;

public class Student implements Serializable{
	
	private int id;
	private String name;
	transient private Address address;
	
	public Student(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}	

	private void writeObject(ObjectOutputStream os){
		try {
			os.defaultWriteObject();
			os.writeObject(address.getHouse());
		}catch(Exception e){
			e.printStackTrace();
		}	
	}

	private void readObject(ObjectInputStream is){
		try{
		is.defaultReadObject();
		address = new Address(is.readUTF());
		}catch(Exception e){
			e.printStackTrace();	
		}
	}

	@Override
	public String toString(){
		return(id+name+address);
	}

}