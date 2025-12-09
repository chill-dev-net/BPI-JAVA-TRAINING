package working_java_files;

public class M2_Activity6 {

	public static void main(String[] args) {
		Car car = new Car("Toyota");
		Truck truck = new Truck("Volvo");

		car.refuel();
		car.startEngine();
		System.out.println("Car wheels: " + car.getNumberOfWheels());

		truck.refuel();
		truck.startEngine();
		System.out.println("Truck wheels: " + truck.getNumberOfWheels());

		destroyVehicle(car);
		destroyVehicle(truck);
	}

	private static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}
}
