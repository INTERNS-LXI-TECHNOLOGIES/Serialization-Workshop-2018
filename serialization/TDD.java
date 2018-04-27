package com.lxisoft.certworkss.serialization;
import java.io.*;
public class TDD
{
	
	public static void main(String args[])
	{
	       Employee employee = new Employee("Archana");	
          Intern intern  = new Intern("Silpa","mecode house",89765,1,employee);
			
			
			
		try{
			System.out.print(new File("silpa.ser").exists());
	        ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("silpa.ser"));
			oos.writeObject(intern);
			
			
	        oos.close();
			
		   }catch(Exception e){e.printStackTrace();}
		   
		   
	}
    
   
   



}