/**
 * 
 */
package Model;

/**Children class
 * @author Ekue Kpodar
 *
 */
public class Children extends Person {

	public Children(String name, int age, double weight, String favFood) {
		
	
		super.setAge(age);
		super.setFavFood(favFood);
		super.setName(name);
		super.setWeight(weight);
	}

	/* (non-Javadoc)
	 * @see Model.Person#setAge(int)
	 */
	@Override
	public void setAge(int age) {
		if(age <= 12){
			throw new IllegalArgumentException("Your age must be less then 12 for you to be a child");
		}
		super.setAge(age);
	}

	
	
	
	

}
