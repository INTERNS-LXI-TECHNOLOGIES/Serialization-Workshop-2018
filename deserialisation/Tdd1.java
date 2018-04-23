import java.io.*;

public class Tdd1{
	public static void main(String[] args){
		Intern intern=null;
		try{
			FileInputStream filein=new FileInputStream("E:/intern.ser");
			ObjectInputStream in=new ObjectInputStream(filein);
			intern=(Intern)in.readObject();
			in.close();
			filein.close();
			
		}
		catch(IOException i){
			i.printStackTrace();
		}
		catch(ClassNotFoundException c){
			c.printStackTrace();
		}
		
		System.out.println("Intern details");
		System.out.println(intern.name+"\n"+intern.address+"\n"+intern.phone+"\n"+intern.country);
		
	}
}