package com.lxisoft.defaultWriteObject;
import java.io.*;
import com.lxisoft.defaultWriteObject.Address;
import com.lxisoft.defaultWriteObject.Student;

public class Tdd{

	public static void main(String[] args){
		
		Address address1 = new Address("Kakkanat");
		//Address address2 = new Address("Karuvath","Thalikulam");
		
		Student student1 = new Student(1,"Vyshnav",address1);
		//Student student2 = new Student(2,"Vysakh",address2);
		
		try{
			FileOutputStream fileOutputStream = new FileOutputStream("student2.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student1);
			objectOutputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fileInputStream = new FileInputStream("student2.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			student1 = (Student)objectInputStream.readObject();
			objectInputStream.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(student1);
		
	}

}