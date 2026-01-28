package M6_Activity3;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "student_id", columnDefinition = "INT")
	private Student student;

	@Column(name = "course_name", length = 50, columnDefinition = "VARCHAR(50)")
	private String course;

	@Column(name = "grade", length = 2, columnDefinition = "VARCHAR(2)")
	private String grade;

	// getters and setters
	public String getCourse() {
		return course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
