package school;

import java.util.HashSet;
import java.util.Set;

public class Pupil extends Person {

	private String form;
	private Set<Subject> pupilSubjects = new HashSet<>();

	public Pupil(String name) {
		super(name);
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
		pupilSubjects.add(subject);
	}

	public void addPupilSubject(String str) {
		Subject subject = Subject.getSubject(str);
		pupilSubjects.add(subject);
	}
	
	public void printPupilSubjects() {
		System.out.print(getName() + "'s subjects are: ");
		for (Subject value: pupilSubjects) {
			System.out.print(value.name() + ", ");
		}
		System.out.println();
	}

}
