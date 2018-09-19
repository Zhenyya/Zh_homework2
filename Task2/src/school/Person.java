package school;

public class Person {

	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return ("name: " + name + ", age: " + age);
	}

	
}