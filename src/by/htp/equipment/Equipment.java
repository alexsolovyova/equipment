package by.htp.equipment;


public abstract class Equipment {
	
	private Category category;
	private String title;
	private double price; 

	
	public Equipment (Category category, String title, int weight, double price ) {
		super();
		this.category = category;
		this.title = title;
		this.price = price;
		
	} }
	
	/* public getType() {
	 
		return type;
	}
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	public getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public getPrice() {
		return price;
	}
	
	public void setPrice(String Colour) {
		this.colour = colour;
	}
}
*\