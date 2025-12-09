package com.bpi.day1_2.M1;

import java.util.Scanner;

public class HelloMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
//		for (int i = 1; i <= 5; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		System.out.println(my_age(18));
//		System.out.println(my_name("John Doe"));

//		Scanner input = new Scanner(System.in); // Create Scanner object
//
//        System.out.print("Enter your name: ");
//        String name = input.nextLine(); // Reads a full line of text
//
//        System.out.print("Enter your age: ");
//        int age = input.nextInt(); // Reads an integer
//
//        System.out.println("Hello " + name + ", you are " + age + " years old.");
//        
//        input.close(); // Always close the Scanner when done
	
        double x = 10.75;
        int y = (int) x;
        System.out.println(y);
        
        int num = Integer.parseInt("123");
        double price = Double.parseDouble("9.99");

	}
	
	public static String my_name(String _myname) {
		return _myname;
	}
	
	public static int my_age(int _myage) {
		return _myage;
	}
	

}
