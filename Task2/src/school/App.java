package school;

public class App {

	public static void main(String[] args) {
		
		Pupil pupil1 = new Pupil("Olya");
		pupil1.setAge(11);
		pupil1.setForm("6-A");
		pupil1.addPupilSubject("history");
		pupil1.addPupilSubject(Subject.MATHS);
		pupil1.addPupilSubject("music");
		pupil1.addPupilSubject("chemistry");
		System.out.println(pupil1);
		pupil1.printPupilSubjects();
		
		Pupil pupil2 = new Pupil("Igor");
		pupil2.setAge(14);
		pupil2.setForm("8-A");
		pupil2.addPupilSubject("literature");
		pupil2.addPupilSubject(Subject.MUSIC);
		pupil2.addPupilSubject("art");
		pupil2.addPupilSubject(Subject.PHYSICS);
		System.out.println(pupil2);
		pupil2.printPupilSubjects();
		
		System.out.println();
		Teacher teacher1 = new Teacher("Ira");
		teacher1.setAge(31);
		System.out.println(teacher1);
		teacher1.addTeacherSubject(Subject.ART);
		teacher1.addTeacherSubject(Subject.MUSIC);
		teacher1.printTeacherSubject();
		Teacher teacher2 = new Teacher("Volodymyr");
		teacher2.setAge(28);
		System.out.println(teacher2);
		teacher2.addTeacherSubject(Subject.MATHS);
		teacher2.addTeacherSubject(Subject.PHYSICS);
		teacher2.printTeacherSubject();
	}

}
