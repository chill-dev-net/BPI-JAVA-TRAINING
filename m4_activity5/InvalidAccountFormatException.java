package m4_activity5;

public class InvalidAccountFormatException extends Exception {

	private String inputAccountNumber;

	public InvalidAccountFormatException(String accountNumber) {
		super("Warning: " + accountNumber);
		this.inputAccountNumber = accountNumber;
	}

}
