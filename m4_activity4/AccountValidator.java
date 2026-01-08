package m4_activity4;

public class AccountValidator {

	public static void main(String[] args) throws Exception {
		System.out.println("Expected Output:");
		validateAccountNumber("1234567890");
		validateAccountNumber("123");
		validateAccountNumber(null);
	}

	public static void validateAccountNumber(String accountNumber) throws Exception {
		try {
			if (accountNumber.length() == 10)
				System.out.println("Valid account: " + accountNumber);
			else
				throw new Exception("Error: Must be 10 digits");

		} catch (NullPointerException e) {
			System.out.println("Error: Cannot be null");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
