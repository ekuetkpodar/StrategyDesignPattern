package Model;

public class CanDrink implements Drink {

	/**Set Message
	 * 
	 */
	@Override
	public String drink(int age) {
		
		return String.format("You can drink since your %s", age);
		
	}

}
