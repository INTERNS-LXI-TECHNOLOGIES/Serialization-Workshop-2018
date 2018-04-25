package serialization;
import java.io.*;

public class Tdd1 {

	public static void main(String[] args) throws IOException {
		String s[]= {"f1.txt","f2.txt","f3.txt","f4.txt","f5.txt"};
		Intern [] interns=new Intern[5];
		interns[0]=new Intern(new StringBuffer("neeraja"),2,new StringBuilder("pkd"));
		interns[1]=new Intern(new StringBuffer("jesily"),3,new StringBuilder("althr"));
		interns[2]=new Intern(new StringBuffer("sooraj"),4,new StringBuilder("kty"));
		interns[3]=new Intern(new StringBuffer("fahad"),5,new StringBuilder("tsr"));
		interns[4]=new Intern(new StringBuffer("aiswarya"),6,new StringBuilder("ppla"));
		for(int i=0;i<5;i++) {
		 try {      
			 FileOutputStream fs = new FileOutputStream(s[i]);   
			 ObjectOutputStream os = new ObjectOutputStream(fs); 
			 os.writeObject(interns[i]);    
			 os.close();   
			 }
		 catch (Exception e){
			 e.printStackTrace();
			 } 

	}
    FileOutputStream fs=new FileOutputStream("testSer.ser");
    ObjectOutputStream os=new ObjectOutputStream(fs);
    os.writeObject(s);
    os.close();
}
}
