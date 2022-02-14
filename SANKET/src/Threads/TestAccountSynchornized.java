package Threads;

import Oop.Account;

public class TestAccountSynchornized extends Thread {

	public static Account a = new Account();


	String s = null;
	 public TestAccountSynchornized(String s) {
		this.s = s;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			a.deposit(s, 1000);		
		}
	}
    	public static void main(String[] args){
		TestAccountSynchornized t1 = new TestAccountSynchornized("ram");
		TestAccountSynchornized t2 = new TestAccountSynchornized("Shyam");
		
		t1.start();
		t2.start();
			
	}			
	}


