package com.bpi.day1_2.M1;

import java.util.ArrayList;
import java.util.Scanner;

public class Group_Project {
	private static Scanner input = new Scanner(System.in);
	private static char choice;
	private static boolean isMenu = true;
	private static String[] arr_stud_record = new String[5];
	private static ArrayList<Integer> arr_stud_grade = new ArrayList<>();
	private static double ave = 0;
	private static String status = "";

	public static void main(String[] args) {
		while (isMenu) {
			main_menu();
			switch (choice) {
			case 'A': {
				add_student_info();
				break;
			}
			case 'B': {
				try {
					compute_student_ave();
				} catch (ArithmeticException e) {
					System.out.println("No data to compute!");
				}
				break;
			}
			case 'C': {
				display_student_info();
				break;
			}
			case 'D': {
				isMenu = false;
				System.out.println("Thank you. Goodbye!!!");
				break;
			}
			default:
				System.out.println("Invalid Input!!!");
				break;
			}
		}
	}

	public static void main_menu() {
		System.out.println("===== STUDENT GRADING SYSTEM =====");
		System.out.println("A = Add Student Information");
		System.out.println("B = Compute Student Average");
		System.out.println("C = Display Student Information");
		System.out.println("D = Exit");
		System.out.print("Enter choice: ");
		choice = input.next().toUpperCase().charAt(0);
	}

	public static void add_student_info() {
		input.nextLine();
		System.out.print("Enter student name: ");
		arr_stud_record[0] = input.nextLine();
		System.out.print("Enter student ID: ");
		arr_stud_record[1] = input.nextLine();
		System.out.print("Enter number of subjects: ");
		arr_stud_record[2] = input.nextLine();
		for (int i = 1; i <= Integer.parseInt(arr_stud_record[2]); i++) {
			System.out.print("Enter grade for subject " + i + ": ");
			arr_stud_grade.add(input.nextInt());
		}
		System.out.println("===== STUDENT SAVED =====");
		System.out.println();
	}

	public static void compute_student_ave() {
		int total_grades = arr_stud_grade.stream().mapToInt(Integer::intValue).sum();
		ave = total_grades / arr_stud_grade.size();
		status = (ave >= 75) ? "PASS" : "FAIL";

		System.out.println("Average: " + ave);
		System.out.println("Status: " + status);
		System.out.println();
	}

	public static void display_student_info() {
		System.out.println("===== STUDENT SUMMARY =====");
		System.out.println("Student Name: " + arr_stud_record[0]);
		System.out.println("Student ID: " + arr_stud_record[1]);
		System.out.println("Average Grade: " + ave);
		System.out.println("Status: " + status);
		System.out.println("===========================");
		System.out.println();
	}

}
