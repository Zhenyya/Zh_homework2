package school;

import java.util.HashSet;
import java.util.Set;

public abstract class Person {

	private String name;
	private int age;
	private Set<Subject> allSubjects = new HashSet<>();
	
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

	public void addSubject(Subject subject) {
		allSubjects.add(subject);
	}

	public void addSubject(String str) {
		Subject subject = Subject.showSubject(str);
		allSubjects.add(subject);
	}
	
	public void printSubject() {
		System.out.print(getName() + "'s subjects are: ");
		for (Subject value: allSubjects) {
			System.out.print(value.name() + ", ");
		}
		System.out.println();
	}
	
}
