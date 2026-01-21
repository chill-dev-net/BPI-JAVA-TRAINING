package M5_Activity3;

public class Student {
	private String name;
	private int age;
	private String email;

	public Student(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getEmail() {
		return this.email;
	}
}
