package by.htp.equipment;

public class Bicycle extends Equipment {

	
private String type;
	
	public Bicycle (String title, double price,
			double weight, String color, String type) {
		super(title, price, weight,color);
		this.type = type;
	
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} }