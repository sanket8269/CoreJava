package Threads;

public class HelloThreads extends Thread {
	 String name = null;
	
	public HelloThreads(String n) {
    name = n;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
	/*		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	*/		System.out.println(i+" "+name);
		//
			}
		}
	public static void main(String[] args) {
		HelloThreads ht = new HelloThreads("Shyam");
		HelloThreads hs = new HelloThreads("ram");
		
		ht.setPriority(1);///test priority
		hs.setPriority(10);
		
		ht.start();
		hs.start();
	}
	
}


