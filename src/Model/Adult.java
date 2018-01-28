package Model;

public class Adult extends Person {
	public Adult(String name, int age, double weight, String favFood) {
		super.setAge(age);
		super.setFavFood(favFood);
		super.setName(name);
		super.setWeight(weight);
	}

	@Override
	public void setAge(int age) {
		if(age >= 18){
			throw new IllegalArgumentException("Your age must be greater then 18");
		}
		super.setAge(age);

}
}
