package M3_Activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class M3_Activity1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<String> products = new ArrayList<>(
				Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Printer"));

		System.out.println("All Products:");
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}

		products.remove(1);
		products.add("Webcam");

		System.out.println();
		System.out.println("After adding and removing a product:");
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}

		System.out.println();
		System.out.print("Enter product name to search: ");
		String product = input.nextLine();

		if (products.contains(product)) {
			System.out.println("Product found: " + product);
		} else {
			System.out.println("Product not found.");
		}

	}

}
