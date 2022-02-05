package Oop;

import Exception_handling.InsuffcientFunds;

public class TestAccount {
public static void main(String[] args) throws InsuffcientFunds{
	 Account a= new Account();
   a.setAccountType("saving");
	 a.setBalance(7000);
     a.setNumber(23445);
	 a.deposit(1000);
     a.Withdraw(400);
	 a.payBill(1000);
	 a.fundTransfer(3000);
	 
	 System.out.println(a.getAccountType());
	 System.out.println(a.getBalance());
	 System.out.println(a.getNumber());
	 

	 
	 
	 
	 /*
      System.out.println(a.getAccountType());
      System.out.println(a.getNumber());
      System.out.println(a.getBalance());
      System.out.println(a.getDeposit());
      System.out.println(a.getFundTransfer());
      System.out.println(a.getPayBill());
      System.out.println(a.getWithDraw());
*/


}
}
