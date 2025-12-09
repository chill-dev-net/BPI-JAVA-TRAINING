package working_java_files;

public class Truck extends Vehicle implements Refuelable {

	public Truck(String brand) {
		super(10, brand);
	}

	@Override
	public void startEngine() {
		System.out.println("Truck " + getBrand() + " engine started...");
	}

	@Override
	public void refuel() {
		System.out.println("Truck " + getBrand() + " refueled with diesel.");
	}
}
