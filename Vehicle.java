package working_java_files;

public abstract class Vehicle {
	private final int numberOfWheels;
	private final String brand;

	protected Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}

	public int getNumberOfWheels() {
		return this.numberOfWheels;
	}

	public String getBrand() {
		return this.brand;
	}

	public abstract void startEngine();

	public void destroy() {
		System.out.println(getClass().getSimpleName() + " " + brand + " is destroyed.");
	}
}
