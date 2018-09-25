package school;

public enum Subject {

	MATHS, PHYSICS, LITERATURE, HISTORY, CHEMISTRY, ART, MUSIC;
	
	public static Subject getSubject(String str) {
		Subject[] values = Subject.values();
		
		for (Subject value : values) {
			String subjectName = value.name();
			if (subjectName.toLowerCase().equals(str)) {
				return value;
			}
		}
		return null;
	}

}
