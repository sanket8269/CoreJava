package Oop;

public class TestAutoMobile {
	public static void main(String[] args) {
		AutoMobile am= new AutoMobile();
		am.setBreak("Break");
		am.setColor("blue");
		am.setMake("BMW");
		am.setAccelator(40);
		am.setSpeed(60);
		System.out.println(am.getAccelator());
		System.out.println(am.getBreak());
		System.out.println(am.getColor());
		System.out.println(am.getMake());
		System.out.println(am.getSpeed());
		System.out.println(AutoMobile.getGear());
	}	

}
