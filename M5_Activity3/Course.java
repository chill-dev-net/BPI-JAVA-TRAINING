package M5_Activity3;

public class Course {
	private int student_id;
	private String course;
	private String grade;

	public Course(int student_id, String course, String grade) {
		this.student_id = student_id;
		this.course = course;
		this.grade = grade;
	}

	public int getStudentID() {
		return this.student_id;
	}

	public String getCourse() {
		return this.course;
	}

	public String getGrade() {
		return this.grade;
	}

}
