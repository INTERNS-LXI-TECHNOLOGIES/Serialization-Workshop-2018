import java.io.*;

public class Tdd{
	public static void main(String[] args){
		Intern intern=new Intern();
		intern.name="anjali";
		intern.address="ottapalam";
		intern.phone=566;
		intern.country="india";
		
		 try {
         FileOutputStream fileOut =new FileOutputStream("E:/intern.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(intern);
         out.close();
         fileOut.close();
         } catch (IOException i) {
         i.printStackTrace();
      }
	}
}