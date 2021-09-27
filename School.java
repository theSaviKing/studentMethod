import java.util.ArrayList; // import the ArrayList class

public class School {
	
	// variables
	private String name;
	private int lowGrade;
	private int highGrade;
	private int numStudents;
	private String principalName;
	private boolean isPublic;
	private ArrayList<String> students;
	public ArrayList<String> schools;

	public School(String name, int numStudents, String principalName) {
		this.name = name;
		this.lowGrade = 0;
		this.highGrade = 5;
		this.numStudents = numStudents;
		this.principalName = principalName;
		this.isPublic = true;
		this.students = new ArrayList<String>();
	}

	public School(String name, int lowGrade, int highGrade, int numStudents, String principalName) {
		this.name = name;
		this.lowGrade = lowGrade;
		this.highGrade = highGrade;
		this.numStudents = numStudents;
		this.principalName = principalName;
		this.isPublic = true;
		this.students = new ArrayList<String>();
	}

	public void add(String studentName) {
		this.students.add(studentName);
	}

	public void makePrivate() {
		this.isPublic = false;
	}

	public boolean isSchool(School school) {
		return schools.indexOf(school) != -1;
	}

}
