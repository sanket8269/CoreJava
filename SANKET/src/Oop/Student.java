package Oop;

public class Student implements Richman {

/*
	@Override
	public void earnMony() {
		System.out.println();
		// TODO Auto-generated method stub
		
	}
*/
	@Override
	public void donation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Richman rm = new Businessman();
	//	SocialWorker sw = new Businessman();
		Businessman bm = new Businessman();
		rm.donation();
	//	rm.earnMony();
		rm.party();
		//sw.helpToOthers();
		//bm.donation();
		//bm.earnMony();
	//	bm.party();
	}
}
