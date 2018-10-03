package school;

import java.util.HashSet;
import java.util.Set;

public class Pupil extends Person {

	private String form;
	private Set<Subject> subjects = new HashSet<>();

	public Pupil(String name, int age) {
		super(name, age);
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getForm() {
		return form;
	}

	@Override
	public String toString() {
		return "name: " + getName() + ", age: " + getAge() + ", pupil of " + form + " form";
	}
	
	public void addPupilSubject(Subject subject) {
		subjects.add(subject);
	}

	public void addPupilSubject(String str) {
		Subject subject = Subject.getSubject(str);
		addPupilSubject(subject);
	}
	
	public void printSubjects() {
		System.out.print(getName() + "'s subjects are: ");
		for (Subject value: subjects) {
			System.out.print(value.name() + ", ");
		}
		System.out.println();
	}

}
