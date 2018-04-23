import java.io.*;

public class Intern implements java.io.Serializable {
	String name;
	String address;
	long phone;
	transient String country;
}