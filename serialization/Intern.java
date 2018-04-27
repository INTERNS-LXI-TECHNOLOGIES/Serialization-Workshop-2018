package com.lxisoft.certworkss.serialization;
import java.io.*;
public class Intern implements Serializable
{
	private String name;
	private String address;
	private int phnno;
	
	transient private   Employee employee;
	transient private  int sessionId;

		public Intern(String name,String address,int phnno,int sessionId,Employee employee)
		{
			this.name = name;
			this.address = address;
			this.phnno = phnno;
			this.sessionId = sessionId;
			this.employee = employee;
		}
		
		private void writeObject(ObjectOutputStream oos)
			{
				try{
				oos.defaultWriteObject();
			    oos.writeUTF(employee.getName());
			
				
				}catch(Exception e){e.printStackTrace();}
			}
		private void readObject(ObjectInputStream ois) 
			{
				try{
				ois.defaultReadObject();
				
				employee = new Employee(ois.readUTF());
			    
				
				}catch(Exception e){e.printStackTrace();}
			
			}
		
		
		//emplgdfoyee.setName("prasad");
	    public void setName(String name)
		
	    {
		  this.name = name;
	    }
	    public String getName()
        {
		  return name;
	    }
		public void setAddress(String address)
		{
			this.address = address;
		}
		public String getAddress()
		{
			return address;
		}
		public void setPhnno(int phnno)
		{
			this.phnno = phnno;
		}
		public int getPhnno()
		{
			return phnno;
		}
		public void setSessionId(int sessionId)
		{
			this.sessionId = sessionId;
		}
		public int getSessionId()
		{
			return sessionId;
		}
		public void setEmployee(Employee employee)
		{
			this.employee = employee;
		}
		public Employee getEmployee()
		{
			return employee;
		}
		
		
	
	
  
}