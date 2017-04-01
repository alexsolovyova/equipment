package by.htp.equipment;


public abstract class Equipment {
	private int id;
	private Category category;
	private String title;
	private double price; 

	
	public Equipment (Category category, String title, int weight, double price ) {
		super();
		this.id = id;
		this.category = category;
		this.title = title;
		this.price = price;
		
	} 
	
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = id;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Category getTitle() {
		return title;
	}
	public void settitle(String Title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setCategory(double price) {
		this.price = price;
	}

	
	
	
	
	
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