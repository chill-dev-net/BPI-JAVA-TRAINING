package m4_activity5;

public class InvalidAccountNumberException extends Exception {

	private String inputAccountNumber;

	public InvalidAccountNumberException(String accountNumber) {
		super("Error: " + accountNumber);
		this.inputAccountNumber = accountNumber;
	}

}
