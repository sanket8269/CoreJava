package Coustum_Data_Type;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountType("Saving");
		ac.setBalance(50000);
		ac.setDeposit(10000);
		ac.setFundtransfer(5000);
		ac.setNumber("83883833");
		ac.setPaybill(900);
		
		System.out.println(ac.getAccountType());
		System.out.println(ac.getBalance());
		System.out.println(ac.getDeposit());
		System.out.println(ac.getFundtransfer());
		System.out.println(ac.getNumber());
		System.out.println(ac.getPaybill());
		}

}
