package m3_activities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class M3_Activity3 {
	private static Scanner getInt = new Scanner(System.in);
	private static Scanner getString = new Scanner(System.in);
	private static int choice;
	private static boolean isMenu = true;
	private static Map<String, Integer> productsMap = new HashMap<>();

	public static void main(String[] args) {

		while (isMenu) {
			loadProducts();
			mainMenu();
			switch (choice) {
			case 1: {
				searchProduct();
				break;
			}
			case 2: {
				addProduct();
				break;
			}
			case 3: {
				printProducts();
				break;
			}
			case 4: {
				findCheapest();
				break;
			}
			case 5: {
				exitProgram();
				break;
			}
			default:
				System.out.println("Invalid Input!!!");
				break;
			}
		}
	}

	public static void loadProducts() {
		productsMap.put("Laptop", 50000);
		productsMap.put("Monitor", 7000);
		productsMap.put("Mouse", 500);
		productsMap.put("Keyboard", 1000);
		productsMap.put("Printer", 6000);
	}

	public static void mainMenu() {
		System.out.println("1. Search a Product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and prices");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
		System.out.print("> ");
		choice = getInt.nextInt();
	}

	public static void searchProduct() {
		System.out.print("Enter product name to search: ");
		String product = getString.nextLine();
		if (productsMap.containsKey(product)) {
			int price = productsMap.get(product);
			System.out.println("Product found! Price: " + price);
		} else {
			System.out.println("Product not found!");
		}
		System.out.println();

	}

	public static void addProduct() {
		System.out.print("Enter product name to add: ");
		String product = getString.nextLine();
		System.out.print("Enter price: ");
		int price = getInt.nextInt();
		productsMap.put(product, price);
		System.out.println("Product added: " + product);
		System.out.println();
	}

	public static void printProducts() {
		System.out.println("All products and prices:");
		for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("Total products: " + productsMap.size());
		System.out.println();
	}

	public static void findCheapest() {
		int lowest = Integer.MAX_VALUE;
		String lowestKey = null;

		for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
			if (entry.getValue() < lowest) {
				lowest = entry.getValue();
				lowestKey = entry.getKey();
			}
		}
		System.out.println("Cheapest product: " + lowestKey + " - " + lowest);
		System.out.println();
	}

	public static void exitProgram() {
		isMenu = false;
		System.out.println("Exiting...");
		System.out.println();

	}

}
