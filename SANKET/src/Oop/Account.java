package Oop;

public class Account {

	//private int number;
	//private String accountType;
	private float balance = 200;
	//private Exception i;
	//private Object insuffcientfunds;
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	public String getAccountType() {
//		return accountType;
//	}
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
		}

// methodes applied
//	 public float deposit(float amount) {
//		 balance = balance+amount;
//		 return amount;
//	 }

	 public float Withdraw(float amount) {
	   balance = balance-amount;
		 return balance;
	 }
//	 public float fundTransfer(float amount) {
//		 balance = balance-amount;
//		 return balance;
//	 }
//	 public float payBill(float amount) {
//		 balance = balance-amount;
//		 return balance;
//	 }
	 public float withdraw() {
		 return 0;
	 }
}


