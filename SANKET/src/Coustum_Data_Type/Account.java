package Coustum_Data_Type;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	private double Deposit;
	private float fundtransfer;
	private float paybill;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return Deposit;
	}
	public void setDeposit(double deposit) {
		Deposit = deposit;
	}
	public float getFundtransfer() {
		return fundtransfer;
	}
	public void setFundtransfer(float fundtransfer) {
		this.fundtransfer = fundtransfer;
	}
	public float getPaybill() {
		return paybill;
	}
	public void setPaybill(float paybill) {
		this.paybill = paybill;
	}
	

}
