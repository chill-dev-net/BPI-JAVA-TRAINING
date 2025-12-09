package com.bpi.day1_2.M1;

import java.util.Scanner;

public class Activity_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();
		double age_d = age;

		System.out.println("Your age as int: " + age);
		System.out.println("Your age as double: " + age_d);
	}

}
