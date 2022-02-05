package Coustum_Data_Type;

public class AutoMobile {
	private String color;
	private int speed;
	private String make;
	public static final int Gear=5;
	
	public AutoMobile(String C , int S, String M) {
		color = C;
		speed = S;
		make = M;
		System.out.println(C+""+S+M);
	}
	
	
	
	  public String getColor() {
		 return color; 
		 }
	 public void setColor(String color){
		 this.color = color; 
		 }
	 public int getSpeed() {
		 return speed; } 
	 public void setSpeed(int speed) {
		 this.speed = speed;
		 } 
	 public String getMake() { 
		 return make; 
		 }
	 public void setMake(String make) { 
		 this.make = make; 
		 }
	 public static int getGear() { 
		 return Gear;
		
	 }
}