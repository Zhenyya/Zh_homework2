package school;

public class App {

	public static void main(String[] args) {
		
		Pupil pupil1 = new Pupil("Olya");
		pupil1.setAge(11);
		pupil1.setForm("6-A");
		pupil1.addSubject("history");
		pupil1.addSubject(Subject.MATHS);
		System.out.println(pupil1);
		pupil1.printSubject();
		
		System.out.println();
		System.out.println(Subject.getSubject("physics"));
		System.out.println();
		
		Teacher teacher1 = new Teacher("Ira");
		teacher1.setAge(31);
		System.out.println(teacher1);
		teacher1.addSubject(Subject.ART);
		teacher1.addSubject(Subject.MUSIC);
		teacher1.printSubject();
		
		System.out.println();
		Pupil pupil2 = new Pupil("Igor");
		pupil2.setAge(14);
		pupil2.setForm("8-A");
		pupil2.addSubject("literature");
		pupil2.addSubject(Subject.MUSIC);
		System.out.println(pupil2);
		pupil2.printSubject();
	}

}
