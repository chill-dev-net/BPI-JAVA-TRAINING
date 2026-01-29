package M6_Activity5;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			JpqlSample.findStudentNames(em);
			JpqlSample.countCoursesByStudentId(em, 1L);
			JpqlSample.findStudentsByAgeGreaterThan(em, 18);
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}

	}

}
