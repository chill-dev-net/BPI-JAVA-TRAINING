package M6_Activity3;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			persistOneToMany(em);
		} finally {
			EntityManagerUtil.getInstance().closeEntityManager(em);
			EntityManagerUtil.getInstance().shutdownFactory();
		}
	}

	static void persistOneToMany(EntityManager em) {
		em.getTransaction().begin();

		Student student1 = em.find(Student.class, 1L);
		Course newCourse = new Course();
		newCourse.setCourse("BSBA");
		newCourse.setGrade("87");
		newCourse.setStudent(student1);

		em.persist(newCourse);
		em.getTransaction().commit();
	}

	static void runM6Activity2(EntityManager em) {
		em.getTransaction().begin();

		Student newStudent = new Student();
		newStudent.setName("Juan Doe");
		newStudent.setAge(21);
		newStudent.setEmail("john_doe@gmail.com");

		em.persist(newStudent);
		em.getTransaction().commit();

	}
}
