package school;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {
	
	private Set<Subject> subjects = new HashSet<>();
	
	public Teacher(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Teacher's name: " + getName() + ", age: " + getAge();
	}
	
	public void addTeacherSubject(Subject subject) {
		subjects.add(subject);
	}

	public void addTeacherSubject(String str) {
		Subject subject = Subject.getSubject(str);
		addTeacherSubject(subject);
	}
	
	public void printSubjects() {
		System.out.print(getName() + "'s subjects are: ");
		for (Subject value: subjects) {
			System.out.print(value.name() + ", ");
		}
		System.out.println();
	}

}
