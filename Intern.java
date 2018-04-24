import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;



public class Intern implements Serializable{
	transient Scanner scan=new Scanner(System.in);
	StringBuffer name;
	static int x;
	transient Car car=new Car();
	transient Integer id;
	StringBuilder pos;
	Intern (){
		x++;
		System.out.print("name:");
		name=new StringBuffer(scan.next());
		System.out.print("id  :");
		id=scan.nextInt();
		System.out.print("pos :");
		pos=new StringBuilder(scan.next());
	}
	private void writeObject(ObjectOutputStream oos) {
			
			
			try {
				oos.defaultWriteObject();
				oos.writeObject(car.brand);
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	private void readObject(ObjectInputStream ois) throws Exception{
		try {
			ois.defaultReadObject();
		 car=new Car();
		 car.brand=(StringBuilder) ois.readObject();
		}
		catch(IOException e){
			
			e.printStackTrace();
		}
	}
}
