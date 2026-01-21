package M5_Activity3;

import java.sql.*;

public class StudentOperations {

	public void addStudent(Student student) throws Exception {
		String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
		Connection con = DBConnection.getConnetion();
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, student.getName());
		ps.setInt(2, student.getAge());
		ps.setString(3, student.getEmail());
		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void getStudents() throws Exception {
		String sql = "SELECT * FROM students";
		Connection con = DBConnection.getConnetion();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("age") + " | "
					+ rs.getString("email"));
		}

		st.close();
		rs.close();
		con.close();
	}

	public void addCourse(Course course) throws Exception {
		String sql = "INSERT INTO courses (student_id, course_name, grade) VALUES (?, ?, ?)";
		Connection con = DBConnection.getConnetion();
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, course.getStudentID());
		ps.setString(2, course.getCourse());
		ps.setString(3, course.getGrade());
		ps.executeUpdate();

		ps.close();
		con.close();
	}

	public void getCourse() throws Exception {
		String sql = "SELECT courses.id, students.name, courses.course_name, courses.grade FROM students INNER JOIN courses ON students.id = courses.student_id";
		Connection con = DBConnection.getConnetion();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " | " + rs.getString("course_name") + " | " + rs.getString("grade")
					+ " | " + rs.getString("name"));
		}

		st.close();
		rs.close();
		con.close();
	}

}
