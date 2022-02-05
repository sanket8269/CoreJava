package Oop;

public class AutoMobileConstructor {

	private String color;
	private String make;
	private int speed;
	private int accelerator;
	private String Break;
	public static final int gear=5;
	
	public AutoMobileConstructor(String c, int s,String m , int ac, String b) {
		color = c;
		speed = s;
		accelerator=ac;
		make = m;
		Break=b;
		System.out.println(c+""+s+ac+m+b);
		}
//	public AutoMobileConstructor(int ac ,String m){
//		accelerator=ac;
//		make = m;
//	System.out.println(ac+""+m);
//	}
//	public AutoMobileConstructor(int gear) {
//		System.out.println(AutoMobileConstructor.gear);
//		}
//	public AutoMobileConstructor(String b) {
//		Break=b;
//		System.out.println(b);
//	}
//	}
}