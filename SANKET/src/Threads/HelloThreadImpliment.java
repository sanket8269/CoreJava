package Threads;

public class HelloThreadImpliment implements Runnable{
	 String name = null;
	 
	 public HelloThreadImpliment(String n) {
	    name = n;
		}
		public void run() {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i < 5; i++) {
				System.out.println(i+" "+name);
			}}
		public static void main(String[] args) {
			HelloThreads ht = new HelloThreads("Shyam");
			HelloThreads hs = new HelloThreads("ram");
			Thread th = new Thread(ht);
			Thread ts = new Thread(hs);
			
			th.start();
			ts.start();
			}}


