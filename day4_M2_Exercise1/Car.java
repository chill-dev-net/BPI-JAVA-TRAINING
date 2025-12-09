package com.bpi.day4_M2_Exercise1;

public class Car {
	private String owner;
	private String brand;
	private String color;
	private int year;

	public Car(String owner, String brand, String color, int year) {
		this.setOwner(owner);
		this.setBrand(brand);
		this.setColor(color);
		this.setYear(year);
	}

	public Car() {
		this.setOwner("");
		this.setBrand("");
		this.setColor("");
		this.setYear(0);
	}

	void move() {
		System.out.println("==================================");
		System.out.println("The " + getColor() + " car is moving...");
		System.out.println("Owner: " + getOwner());
		System.out.println("Brand: " + getBrand());
		System.out.println("Year: " + getYear());
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}