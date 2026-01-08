package m4_activity5;

public class AccountValidator {

	public static void main(String[] args) throws Exception {
		System.out.println("Expected Output:");
		System.out.println("=== Account Number Validation Test ===\n");

		System.out.println("Test 1: Valid account (1234567890)");
		validateAccountNumber("1234567890");

		System.out.println("Test 2: Too short (123)");
		validateAccountNumber("123");

		System.out.println("Test 3: Contains letters (12345ABC90)");
		validateAccountNumber("12345ABC90");

		System.out.println("Test 4: Contains space (1234 567890)");
		validateAccountNumber("1234 567890");

		System.out.println("Test 5: Null value");
		validateAccountNumber(null);
	}

	public static void validateAccountNumber(String accountNumber) throws Exception {
		try {
			for (char c : accountNumber.toCharArray())
				if (!Character.isDigit(c))
					throw new InvalidAccountFormatException("Account number must contain only digits");

			if (accountNumber.length() == 10)
				System.out.println("Valid account number: " + accountNumber);
			else
				throw new InvalidAccountNumberException("Account number must be exactly 10 digits");

		} catch (NullPointerException e) {
			System.out.println("Warning: Account number cannot be null");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
	}
}
