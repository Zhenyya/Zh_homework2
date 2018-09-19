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
		return super.toString() + " is teacher";
	}
	
	public void addSubject(Subject subject) {
		teacherSubjects.add(subject);
	}
	
	public void printSubject() {
		System.out.print(getName() + "'s subjects are: ");
		for (Subject value: teacherSubjects) {
			System.out.print(value.name() + ", ");
		}
		System.out.println();
	}

}
