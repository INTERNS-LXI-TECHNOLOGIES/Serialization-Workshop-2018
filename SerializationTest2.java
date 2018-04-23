import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationTest2 {
	public static void main(String[]args) throws IOException, ClassNotFoundException {
		
		FileInputStream fo=new FileInputStream("fileNames.txt");
		ObjectInputStream oo=new ObjectInputStream(fo);
		String [] fileNames=(String [])oo.readObject();
		for(String fileName:fileNames) {
			fo=new FileInputStream(fileName);
			 oo=new ObjectInputStream(fo);
			Intern tempIntern=(Intern)oo.readObject();
		System.out.println("name "+tempIntern.name+"  id "+tempIntern.id+" pos "+tempIntern.pos);
		}
	}

}
