package serialization;
import java.io.*;
public class Tdd2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		  Intern[] interns=new Intern[5];
		  interns[0]=null;
		  interns[1]=null;
		  interns[2]=null;
		  interns[3]=null;
		  interns[4]=null;
		  
		
			  FileInputStream fis = new FileInputStream("testSer.ser");    
			  ObjectInputStream ois = new ObjectInputStream(fis);    
			String s[] = (String[]) ois.readObject();  
			
			for(int i=0;i<5;i++) {
				try {    
					fis=new FileInputStream(s[i]);
					ois=new ObjectInputStream(fis);
					interns[i]=(Intern)ois.readObject();
					ois.close();    
			  }
		  catch (Exception e) {
			  e.printStackTrace(); 
			  }
			
		
		    System.out.println("name " + interns[i].getName()+" id"+interns[i].getId()+" address "+interns[i].getAddress()+" "+interns[i].getCar().getName()+" "+interns[i].getCar().getColour());  } 
	}
	}


