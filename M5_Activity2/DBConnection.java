package M5_Activity2;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:h2:file:C:/Users/clvillanueva/Downloads/JAVA-TRAINING/Day-16/h2-2025-09-22/h2/bin/data/my_course_db";
	private static final String USER = "sa";
	private static final String PASS = "";

	public static Connection getConnetion() throws Exception {
		return DriverManager.getConnection(URL, USER, PASS);
	}
}
