package by.htp.equipment;


public abstract class Equipment extends Items{
	
	private String color;

	public Equipment(String title, double price, Category category, String type) {
		super();
		this.color=color;
		
		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	
	
	

	@Override
	public String toString() {
		return super.toString() + " Color=" + color;
	}
	
} 
