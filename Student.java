import java.time.LocalDate;

public class Student {

	// variables
	private String fName;
	private String lName;
	private String name;
	private int grade;
	private double gpa;
	private String username;
	private School school;
	LocalDate date = LocalDate.now();
	int year = date.getYear();

	public Student(String fName, String lName, int grade, School school, double gpa) {
		if (school.isSchool(school)) {
			this.school = school;
		} else {
			System.out.print("ERROR: Invalid school.");
		}
		this.fName = capitalize(fName);
		this.lName = capitalize(lName);
		this.grade = grade;
		this.gpa = gpa;
		this.username = this.usernameGenerator(fName, lName, grade);
		this.name = this.fName.concat(" ".concat(this.lName));
	}

	public String usernameGenerator(String fName, String lName, int grade) {
		String uname = fName.substring(0, 3)
				.concat(lName.substring(0, 7).concat(String.valueOf(year + (12 - grade)).substring(2)));
		return uname.toLowerCase();
	}

	public String print() {
		String print = "  Student:\t\t" + this.name + "\n  Grade:\t\t" + this.grade + "\n  School:\t\t" + this.school
				+ "\n  GPA:\t\t\t" + this.gpa + "\n[ username:\t\t" + this.username + " ]";
		return print;
	}

	public static String capitalize(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}
