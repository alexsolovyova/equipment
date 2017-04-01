package launch;

import by.htp.equipment.*;
public class Main {

	public static void main(String[] args) {
	

		
			
				Equipment [] equi = new equipment[4];
							equi[0] = new Equipment("Helmet", "red", "300g", "50");
								
							equi[1] = new Equipment("Kneepads", "black", "400g", "50");
									
							equi[2] = new Equipment("Elbowpads", "white", "400g", "50");
									
							equi[3] = new Equipment("Kneepads", "black", "400g", "50");
							
							
							Equipment l = new Equipment();
					        
					        for (Equipment k : equi) {
					            l.addEquipment(k);
					        }
			}

			System.out.println("Список взятого снаряжения напрокат");
	        l.listOut(equi);


	}


