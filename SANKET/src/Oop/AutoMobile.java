package Oop;

public class AutoMobile {
      private String color;
      private String make;
      private int speed;
      private String Break;
      private int Accelator;
      public static final int gear=5;
      
      
      public int getAccelator() {
    	  return Accelator;
	}
	public void setAccelator(int ac) {
		Accelator = ac;
	}
	
      
      public String getBreak() {
		return Break;
	}
	public void setBreak(String b) {
		Break = b;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String m) {
		make = m;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public static int getGear() {
		return gear;
	}
      
}
