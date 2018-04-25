package com.lxisoft.certworkss.serialization;
import java.io.*;
public class Employee implements Serializable
{
   private String name;
   public Employee(String name)
   {
	   this.name = name;
   }
   
   public void setName(String name)
   {
	   this.name = name;
   }
   public String getName()
   {
	   return name;
   }
   
}
