package com.bpi.day1_2.M1;

import java.util.Scanner;

public class Activity_3 {
	static Scanner input = new Scanner(System.in);
	static int int1 = 0;
	static int int2 = 0;

	public static void main(String[] args) {
		get_int_1();
		get_int_2();
		get_sum(int1, int2);
		get_diff(int1, int2);
		get_prod(int1, int2);
	}

	public static void get_int_1() {
		System.out.print("Enter first integer: ");
		int1 = input.nextInt();
	}

	public static void get_int_2() {
		System.out.print("Enter second integer: ");
		int2 = input.nextInt();
	}

	public static void get_sum(int int1, int int2) {
		int total = int1 + int2;
		System.out.println("Sum: " + total);
	}
	public static void get_diff(int int1, int int2) {
		int total = int1 - int2;
		System.out.println("Difference: " + total);
	}

	public static void get_prod(int int1, int int2) {
		int total = int1 * int2;
		System.out.println("Product: " + total);
	}

}
