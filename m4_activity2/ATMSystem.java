package m4_activity2;

public class ATMSystem {

	static double[] accounts = { 10000, 15000, 20000 };

	public static void main(String[] args) {
		System.out.println("Expected Output: ");
		System.out.println("=== ATM Withdrawal System ===");
		System.out.println();
		System.out.println("--- Test 1: Valid Withdrawal ---");
		processWithdrawal("1", "5000");
		System.out.println();
		System.out.println("--- Test 2: Invalid Account Index ---");
		processWithdrawal("abc", "5000");
		System.out.println();
		System.out.println("--- Test 3: Account Not Found ---");
		processWithdrawal("10", "5000");
		System.out.println();
		System.out.println("--- Test 4: Insufficient Funds ---");
		processWithdrawal("1", "20000");
		System.out.println();
		System.out.println("=== All tests completed! ===");
	}

	public static void processWithdrawal(String accountIndex, String amountInput) {
		try {
			System.out.println("Account=" + accountIndex + ", Amount=" + amountInput);
			int indexToInt = Integer.parseInt(accountIndex);
			double getAccount = accounts[indexToInt];
			double currBal = 15000;
			System.out.println("Current Balance: P" + currBal + "0");
			System.out.println("Withdrawal: P" + amountInput + ".00");
			if (getAccount >= Integer.parseInt(amountInput)) {
				double newBal = currBal - Integer.parseInt(amountInput);
				System.out.println("New Balance: P" + newBal + "0");
				System.out.println("Withdrawal successful!");
			} else {
				System.out.println("Insufficient funds! Cannot withdraw P" + amountInput + ".00");
			}

		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid input!");
			System.out.println("Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Account not found!");
			System.out.println("Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed");
		}

	}
}
