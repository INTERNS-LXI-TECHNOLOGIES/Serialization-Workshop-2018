import java.io.Serializable;
import java.util.Scanner;



public class Intern implements Serializable{
	transient Scanner scan=new Scanner(System.in);
	StringBuffer name;
	transient Integer id;
	StringBuilder pos;
	Intern (){
		
		System.out.print("name:");
		name=new StringBuffer(scan.next());
		System.out.print("id  :");
		id=scan.nextInt();
		System.out.print("pos :");
		pos=new StringBuilder(scan.next());
	}
}
