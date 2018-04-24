package com.lxisoft.serialization;
import java.io.*;
import com.lxisoft.serialization.Address;
import com.lxisoft.serialization.Student;

/*
	'implements Serializable' not given: Code compiles, IOexception is caught, output runs
	'implements Serializable' given: Code compiles, no IOexception, output runs
*/

public class Tdd1{

	public static void main(String[] args){
		
		//Address address1 = new Address("Kakkanat","Ayyanthole");
		//Address address2 = new Address("Karuvath","Thalikulam");
		
		Student student1 = new Student(1,"Vyshnav");
		//Student student2 = new Student(2,"Vysakh",address2);
		
		try{
			FileOutputStream fileOutputStream = new FileOutputStream("student.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student1);
			objectOutputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fileInputStream = new FileInputStream("student.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			student1 = (Student)objectInputStream.readObject();
			objectInputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(student1);
		
	}

}