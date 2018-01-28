package Model;
/**Base Class
 * 
 * @author Ekue Kpodar
 *
 */

public class Person {
	private String name;
	private int age;
	private double weight;
	private String favFood;
	private Drink drinkType;
	
	
	
	
	
	/**Default Constructor
	 * 
	 */
	public Person() {
		
	}




	/**Create a Person
	 * @param name
	 * @param age
	 * @param weight
	 * @param favFood
	 */
	public Person(String name, int age, double weight, String favFood) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.favFood = favFood;
	}




	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}




	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}




	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}




	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}




	/**
	 * @return the favFood
	 */
	public String getFavFood() {
		return favFood;
	}




	/**
	 * @param favFood the favFood to set
	 */
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}





	/**Set Drink base on age
	 * 
	 */
	public void setDrinkType() {
		if(age <= 18){
			this.drinkType = new CantDrink();
			
		}else{
			this.drinkType = new CanDrink();
		}
		
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", favFood=" + favFood + ", drinkType="
				+ drinkType + "]";
	}
	/**Print Drinking message
	 * 
	 */
	public void Drink(){
		System.out.println(this.drinkType.drink(age));
	}
	
	
	
	 
	
	
	
	
	
	
	
	
	

}
