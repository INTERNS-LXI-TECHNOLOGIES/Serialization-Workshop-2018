import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo=null;
		ObjectOutputStream oo=null;
		String [] fileNames= {"manu.txt","sooraj.txt","krip.txt","suji.txt","sunil.txt"};
		
		try {
			for(String fileName:fileNames) {
				Intern i=new Intern();
				 fo=new FileOutputStream(fileName);
				 oo=new ObjectOutputStream(fo);
				oo.writeObject(i);
			}
			 fo=new FileOutputStream("fileNames.txt");
			 oo=new ObjectOutputStream(fo);
			oo.writeObject((Object)fileNames);
			 
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			fo.close();
			oo.close();
		}
		

	}

}
