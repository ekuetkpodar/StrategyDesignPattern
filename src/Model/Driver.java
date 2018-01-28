package Model;
/**Test The class design pattern
 * 
 * @author Ekue Kpodar
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		Children john = new Children("John", 5, 56,"Pizza");
		john.setDrinkType();
		john.Drink();
		Teen jamie = new Teen("John", 14, 100.7,"Pizza");
		jamie.setDrinkType();
		jamie.Drink();
		
		
		Adult josh = new Adult("John", 26, 180,"Pizza");
		josh.setDrinkType();
		josh.Drink();
	}

}
