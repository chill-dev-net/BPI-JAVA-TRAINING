package m4_activity6;

public class InsufficientFundsException extends Exception {
	private final double balance;
	private final double requestedAmount;

	public InsufficientFundsException(String message, double balance, double requestedAmount) {
		super(message);
		this.balance = balance;
		this.requestedAmount = requestedAmount;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getRequestedAmount() {
		return this.requestedAmount;
	}
}
