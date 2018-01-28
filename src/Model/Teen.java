package Model;

public class Teen extends Person {

	public Teen(String name, int age, double weight, String favFood) {
	
		super.setAge(age);
		super.setFavFood(favFood);
		super.setName(name);
		super.setWeight(weight);
	}

	@Override
	public void setAge(int age) {
		if(age > 12 && age <= 17  ){
			throw new IllegalArgumentException("Your age must be between 13 and 17");
		}
		super.setAge(age);
	}
}
