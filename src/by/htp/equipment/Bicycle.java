package by.htp.equipment;

public class Bicycle extends Equipment {

	private String colour;
	private double size; 
	
	public Bicycle(int id, Category category, String title, double price, String colour, double size);
	
	super(id, category, title, price);
	this.colour = colour;
	this.size = size;
}

public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public double getSize() {
	return size;
}
public void setSize(Double Size) {
	this.size = size;
}

	
}
