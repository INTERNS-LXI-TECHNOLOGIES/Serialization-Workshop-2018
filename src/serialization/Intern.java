package serialization;
import java.io.Serializable;

public class Intern implements Serializable {

	private StringBuffer name;
	private StringBuilder address;
	private transient int id;

	public Intern(StringBuffer nameRcd, int idRcd, StringBuilder addressRcd) {

		setName(nameRcd);
		setAddress(addressRcd);
		setId(idRcd);

	}

	public StringBuffer getName() {
		return name;
	}

	public void setName(StringBuffer name) {
		this.name = name;
	}

	public StringBuilder getAddress() {
		return address;
	}

	public void setAddress(StringBuilder address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
