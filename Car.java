package working_java_files;

public class Car extends Vehicle implements Refuelable {

	public Car(String brand) {
		super(4, brand);
	}

	@Override
	public void startEngine() {
		System.out.println("Car " + getBrand() + " engine started...");
	}

	@Override
	public void refuel() {
		System.out.println("Car " + getBrand() + " refueled with gasoline...");
	}
}
