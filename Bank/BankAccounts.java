package Bank;

public class BankAccounts extends BankAccount{
	private int accountNumber;
	private double balance;
	private String customerName;

	@Override
	public String getCustomerName() {
		return this.customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance =balance;
		
	}

	@Override
	public int getAccountNumber() {
		return this.accountNumber ;
	}

	@Override
	public void setAccountNumber(int accountNumber) {
		this.accountNumber =accountNumber;
		
	}
	
	
}
