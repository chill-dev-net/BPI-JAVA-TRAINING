package M3_Activities;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class M3_Activity2 {
	private static Scanner input = new Scanner(System.in);
	private static Scanner inputProduct = new Scanner(System.in);
	private static int choice;
	private static boolean isMenu = true;
	private static Set<String> set = new HashSet<>(List.of("Laptop", "Mouse", "Keyboard", "Monitor", "Printer"));

	public static void main(String[] args) {
		while (isMenu) {
			main_menu();
			switch (choice) {
			case 1: {
				search_product();
				break;
			}
			case 2: {
				add_product();
				break;
			}
			case 3: {
				print_products();
				break;
			}
			case 4: {
				exit_program();
				break;
			}
			default:
				System.out.println("Invalid Input!!!");
				break;
			}
		}
	}

	public static void main_menu() {
		System.out.println("1. Search a Product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Exit");
		System.out.print("> ");
		choice = input.nextInt();
	}

	public static void search_product() {
		System.out.print("Enter product name to search: ");
		String product = inputProduct.nextLine();
		if (set.contains(product)) {
			System.out.println("Product found: " + product);
		} else {
			System.out.println("Product not found!");
		}
		System.out.println();

	}

	public static void add_product() {
		System.out.print("Enter product name to add: ");
		String product = inputProduct.nextLine();
		set.add(product);
		System.out.println("Product added: " + product);
		System.out.println();
	}

	public static void print_products() {
		System.out.println("All products:");
		for (String product : set) {
			System.out.println(product);
		}
		System.out.println("Total unique products: " + set.size());
		System.out.println();
	}

	public static void exit_program() {
		isMenu = false;
		System.out.println("Exiting...");
		System.out.println();

	}

}
