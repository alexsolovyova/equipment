package rent;

import by.htp.equipment.*;
public class RentStation {

	private Equipment [] equipmentlist = new Equipment[100];
	 int k = 0; 
	 
	    public void addEquipment(Equipment m) {

	        equipmentlist[k++] = m;

	    }
	
	
	public void listOut(Equipment[] equipmentlist) {
	
	     for (Equipment m : equipmentlist) {
	    	 System.out.print("type: " + m.getType() + ", ");
	    	 System.out.print("colour: " + m.getColour() + ", ");
	    	 System.out.print("weight: " + m.getWeight() + ", ");
	     	 System.out.print("price: " + m.getPrice() + ", ");
	     }
	}}
