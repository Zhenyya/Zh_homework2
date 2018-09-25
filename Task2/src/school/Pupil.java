package school;

public class Pupil extends PersonInSchool {

	private String form;

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

}
