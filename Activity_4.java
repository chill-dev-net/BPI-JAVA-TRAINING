package com.bpi.day1_2.M1;

import java.util.Scanner;

public class Activity_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		String result = (age < 18) ? "Minor" : (age >= 60) ? "Senior" : "Adult";

		System.out.println(result);
	}

}
