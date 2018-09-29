package school;

import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {
	
	private Set<Subject> teacherSubjects = new HashSet<>();
	
	public Teacher(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Teacher's name: " + getName() + ", age: " + getAge();
	}
	
	public void addTeacherSubject(Subject subject) {
		teacherSubjects.add(subject);
	}

	public void addTeacherSubject(String str) {
		Subject subject = Subject.getSubject(str);
		teacherSubjects.add(subject);
	}
	
	public void printTeacherSubject() {
		System.out.print(getName() + "'s subjects are: ");
		for (Subject value: teacherSubjects) {
			System.out.print(value.name() + ", ");
		}
		System.out.println();
	}

}
