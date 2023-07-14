package Bank;

public abstract class BankAccount {
	public abstract String getCustomerName();
	public abstract void setCustomerName(String customerName);
	public abstract double getBalance();
	public abstract void setBalance(double balance);
	public abstract int getAccountNumber();
	public abstract void setAccountNumber(int accountNumber);
}
