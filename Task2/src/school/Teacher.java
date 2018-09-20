package school;

public class Teacher extends Person {
	
	public Teacher(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "name: " + getName() + ", age: " + getAge() + " is teacher";
	}

}
