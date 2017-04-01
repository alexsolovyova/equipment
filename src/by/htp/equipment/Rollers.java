package by.htp.equipment;

public class Rollers extends Equipment {
	
	private String colour;
	private double size; 
	
	Public Rollers(int id, Category category, String title, double price, String colour, double size);
	
	super(id, category, title, price);
	this.colour = colour;
	this. size = size;

}
