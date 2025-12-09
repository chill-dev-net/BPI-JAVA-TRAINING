package com.bpi.day4_M2_Exercise1;

public class Exercise_1 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setOwner("John Doe");
		car1.setBrand("Tesla");
		car1.setColor("White");
		car1.setYear(2025);

		Car car2 = new Car("Rick Grimes", "BMW", "Black", 2022);

		car1.move();
		car2.move();

	}

}
