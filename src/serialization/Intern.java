package serialization;

import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Intern implements Serializable {
	// transient Scanner scan=new Scanner(System.in);
	private transient Car car = new Car("swift", "white");
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	private StringBuffer name;
	private transient int id;
	private StringBuilder address;

	
	public Intern(StringBuffer name, int id, StringBuilder address) {
		// System.out.println("enter the name");
		// this.name=new StringBuffer(scan.next());
		// System.out.println("enter the id");
		// this.id=scan.nextInt();
		// System.out.println("enter the address");
		// this.address=new StringBuilder(scan.next());

		setName(name);
		setAddress(address);
		setId(id);
	}

	public StringBuffer getName() {
		return name;
	}

	public void setName(StringBuffer name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StringBuilder getAddress() {
		return address;
	}

	public void setAddress(StringBuilder address) {
		this.address = address;
	}

	private void writeObject(ObjectOutputStream os)  {
		try {
			os.defaultWriteObject();
			os.writeObject(car.getName());
			os.writeObject(car.getColour());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
	try {
		is.defaultReadObject();
		car=new Car(is.readObject());
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}

