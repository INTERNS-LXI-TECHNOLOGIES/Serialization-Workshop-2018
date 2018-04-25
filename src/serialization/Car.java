package serialization;

public class Car {
	private String name;
	private String colour;
	public  Car(String name,String colour) {
		setName(name);
		setColour(colour);
	}
	
	public Car(Object readObject) {
		
		name=(String)readObject;
		colour=(String)readObject;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}
