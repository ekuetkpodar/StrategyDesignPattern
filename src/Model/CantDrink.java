package Model;

public class CantDrink implements Drink {

	/**Set Message
	 * 
	 */
	@Override
	public String drink(int age) {
	
		int in = 18 -age;
		return String.format("Your not old enought to drink. come back in %s", in);
	}

}
