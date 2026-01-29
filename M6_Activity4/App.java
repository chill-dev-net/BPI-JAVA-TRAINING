package M6_Activity4;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		EntityManager em = EntityManagerUtil.getInstance().createEntityManager();

		try {
			m6Activity4Solution(em);
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

	static void m6Activity4Solution(EntityManager em) {

		em.getTransaction().begin();

		// 1. create Student object, assign values
		Student newStudent = new Student();
		newStudent.setName("Jane Doe");
		newStudent.setAge(18);
		newStudent.setEmail("jane_doe@gmail.com");

		// 2. attach transient student object to persistence context
		em.persist(newStudent);

		// 3. call flush()
		em.flush();
		
		// 4. detach the managed newStudent from the persistence context
		em.detach(newStudent);

		// 5. print "is newStudent inside the persistence context: " + call contains()
		System.out.println("is newStudent inside the persistence context: " + em.contains(newStudent));

		// 6. reattach the detached newStudent
		Student managedStudent = em.merge(newStudent);

		// 7. update newStudent, change some values like age or email
		managedStudent.setAge(19);
		managedStudent.setEmail("jane_doe_updated@gmail.com");

		// 8. call flush()
		em.flush();

		// 9. print "is newStudent inside the persistence context: " + call contains()
		System.out.println("is newStudent inside the persistence context: " + em.contains(managedStudent));

		// 11. mark managed newStudent for deletion
		em.remove(managedStudent);

		// 12. call flush()
		em.flush();
		
		// 13. print "is newStudent inside the persistence context: " + call contains()
		System.out.println("is newStudent inside the persistence context: " + em.contains(newStudent));

		em.getTransaction().commit();
	}

}
