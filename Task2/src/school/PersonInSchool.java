package school;

import java.util.HashSet;
import java.util.Set;

public abstract class PersonInSchool extends Person {
	
	private Set<Subject> allSubjects = new HashSet<>();

	public PersonInSchool(String name) {
		super(name);
	}

	public void addSubject(Subject subject) {
		allSubjects.add(subject);
	}

	public void addSubject(String str) {
		Subject subject = Subject.getSubject(str);
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
