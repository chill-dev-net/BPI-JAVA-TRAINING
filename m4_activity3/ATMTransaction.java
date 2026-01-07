package m4_activity3;

public class ATMTransaction {

	public static void main(String[] args) {
		System.out.println("Test 1:");
		checkBalance("100123456", 15000.00);
		System.out.println("Test 2:");
		checkBalance("200987654", 25000.00);
		System.out.println("Test 3:");
		checkBalance("ABC12345", 15000.00);
		System.out.println("Test 4:");
		checkBalance("", 15000.00);
	}

	public static void checkBalance(String accountNumber, double balance) {
		try {
			System.out.println("Processing balance inquiry...");
			char accountType = accountNumber.charAt(0);
			String accountDisplay = accountType == '1' ? "Savings" : accountType == '2' ? "Checking" : "Unknown";
			int iAccountNum = Integer.parseInt(accountNumber);
			

			System.out.println("Account Type: " + accountDisplay);
			System.out.println("Account Number: " + iAccountNum);
			System.out.println("Current Balance: P" + balance);
			System.out.println("Balance inquiry successful!");

		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid account number format! Account numbers must be numeric.");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: Account number is empty or invalid!");
		} finally {
			System.out.println("\n========== RECEIPT ==========");
			System.out.println("Transaction Date: December 3, 2025");
			System.out.println("Transaction Type: Balance Inquiry");
			System.out.println("ATM Location: Main Branch");
			System.out.println("Thank you for banking with us!");
			System.out.println("===============================\n");
		}
		System.out.println();

	}
}
