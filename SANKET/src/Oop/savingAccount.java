package Oop;
//intresting Facts - overriding//
public class savingAccount extends Account1{
	public int getAmount() {
			return 10;
	}

	
	
	
	//	public int getAmount() {
//		int i = super.getAmount() + 10;
//		return i;
//	}
	public static void main(String[] args) {
		savingAccount s = new savingAccount();
		Account1 sa = new savingAccount();
		Account1 a = new Account1();
		
		System.out.println(s.getAmount());
		System.out.println(sa.getAmount());
		System.out.println(a.getAmount());
			
	}

}
