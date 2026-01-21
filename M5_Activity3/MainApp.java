package M5_Activity3;

import java.util.Scanner;

public class MainApp {

	private static Scanner scan = new Scanner(System.in);
	private static StudentOperations so = new StudentOperations();
	private static int choice;
	private static boolean isMenu = true;

	public static void main(String[] args) throws Exception {

		while (isMenu) {
			mainMenu();
			switch (choice) {
			case 1: {
				addStudent();
				break;
			}
			case 2: {
				addCourse();
				break;
			}
			case 3: {
				showStudents();
				break;
			}
			case 4: {
				showCourses();
				break;
			}
			case 0: {
				exitApplication();
				break;
			}
			default:
				System.out.println("Invalid Input!!!");
				break;
			}
		}
	}

	public static void mainMenu() {
		System.out.println("===== STUDENT COURSE MANAGEMENT =====");
		System.out.println("1. Add Student");
		System.out.println("2. Add Course");
		System.out.println("3. Show Students");
		System.out.println("4. Show Courses");
		System.out.println("0. Exit");
		System.out.print("Choose an option: ");
		choice = scan.nextInt();
		System.out.println();
	}

	public static void addStudent() throws Exception {
		scan.nextLine();
		System.out.print("Enter name: ");
		String name = scan.nextLine();
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		System.out.print("Enter email: ");
		scan.nextLine();
		String email = scan.nextLine();
		System.out.println("Student added successfully!");

		so.addStudent(new Student(name, age, email));
		System.out.println();
	}

	public static void addCourse() throws Exception {
		System.out.print("Enter student ID: ");
		int student_id = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter course name: ");
		String course = scan.nextLine();
		System.out.print("Enter grade: ");
		String grade = scan.nextLine();
		System.out.println("Course added successfully!");

		so.addCourse(new Course(student_id, course, grade));
		System.out.println();
	}

	public static void showStudents() throws Exception {
		System.out.println("ID | Name | Age | Email");
		System.out.println("-----------------------------");
		so.getStudents();
		System.out.println();
	}

	public static void showCourses() throws Exception {
		System.out.println("ID | Course Name | Grade | Student Name");
		System.out.println("-----------------------------------------");
		so.getCourse();
		System.out.println();
	}

	public static void exitApplication() throws Exception {
		System.out.println("Exiting application. Goodbye!");
		isMenu = false;
		scan.close();
	}

}
