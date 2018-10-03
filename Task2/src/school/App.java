package school;

public class App {

	public static void main(String[] args) {
		
		Pupil pupil1 = new Pupil("Olya", 11);
		pupil1.setForm("6-A");
		pupil1.addPupilSubject("history");
		pupil1.addPupilSubject(Subject.MATHS);
		pupil1.addPupilSubject("music");
		pupil1.addPupilSubject("chemistry");
		System.out.println(pupil1);
		pupil1.printSubjects();
		
		Pupil pupil2 = new Pupil("Igor", 14);
		pupil2.setForm("8-A");
		pupil2.addPupilSubject("literature");
		pupil2.addPupilSubject(Subject.MUSIC);
		pupil2.addPupilSubject("art");
		pupil2.addPupilSubject(Subject.PHYSICS);
		System.out.println(pupil2);
		pupil2.printSubjects();
		
		System.out.println();
		Teacher teacher1 = new Teacher("Ira", 31);
		System.out.println(teacher1);
		teacher1.addTeacherSubject(Subject.ART);
		teacher1.addTeacherSubject(Subject.MUSIC);
		teacher1.printSubjects();
		Teacher teacher2 = new Teacher("Volodymyr", 28);
		System.out.println(teacher2);
		teacher2.addTeacherSubject(Subject.MATHS);
		teacher2.addTeacherSubject(Subject.PHYSICS);
		teacher2.printSubjects();
	}

}
