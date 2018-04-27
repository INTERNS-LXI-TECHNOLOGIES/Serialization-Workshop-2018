package com.lxisoft.certworkss.deserialization;
import com.lxisoft.certworkss.serialization.Intern;
import java.io.*;
public class TDD
{
	
	public static void main(String args[]) throws OptionalDataException
	{
            
			Intern n;
			
			
		try{
			System.out.print(new File("silpa.ser").exists());
	        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("silpa.ser"));
	        n = (Intern) ois.readObject();
	        ois.close();
			System.out.print(n.getName()+"\n"+n.getAddress()+"\n"+n.getPhnno()+"\n"+n.getSessionId()+"\n"+n.getEmployee().getName());
			System.out.print("...............................");
		   }catch(Exception e){e.printStackTrace();}
		   
		   
	}
    
   
   



}