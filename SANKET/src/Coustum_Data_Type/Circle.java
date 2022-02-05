package Coustum_Data_Type;

public class Circle extends Shape{
	private int radius;
	public static final double PI=3.14;

	public Circle() {}
	
	public Circle (int radius) {
		this.radius=radius;
	}
	
//	
//	public static double getPi() {
//		return PI;
//	}
//
//	public void setRadius(int radius) {
//		this.radius = 8;
//	}
	public double area() {
		return 3.14*radius*radius;
}
}