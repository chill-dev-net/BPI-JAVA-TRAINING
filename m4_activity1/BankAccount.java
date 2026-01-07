package m4_activity1;

public class BankAccount {

	public static void main(String[] args) {
		System.out.println("Expected Output: ");
		System.out.println("=== Bank Account Name Display ===");
		System.out.println();
		testCase("ACC-001");
		testCase("ACC-999");

		System.out.println("=== Program completed successfully! ===");
	}

	public static String getAccountName(String accountNumber) {

		if (accountNumber.equals("ACC-001")) {
			return "Juan Dela Cruz";
		} else if (accountNumber.equals("ACC-002")) {
			return "Maria Santos";
		} else {
			return null;
		}

	}

	public static void testCase(String accountNumber) {
		try {
			System.out.println("Looking up account: " + accountNumber);
			String upperName = getAccountName(accountNumber).toUpperCase();
			System.out.println("Account Holder: " + upperName);

		} catch (NullPointerException e) {
			System.out.println("Error: Account not found!");
		}
		System.out.println();

	}
}
