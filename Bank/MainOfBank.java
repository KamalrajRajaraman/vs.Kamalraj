package Bank;

import java.io.ObjectInputStream.GetField;

public class MainOfBank {
	public static void main(String[] args) {
		BankAccounts person1 = new BankAccounts();
		person1.setCustomerName("kamal");
		person1.setAccountNumber(615423218);
		person1.setBalance(100000);
		System.out.println("CustomerName : "+person1.getCustomerName());
		System.out.println("AccountNumber: "+person1.getAccountNumber());
		System.out.println("Balance : "+person1.getBalance());
	}
}
