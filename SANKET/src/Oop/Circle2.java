package Oop;

public class Circle2 extends Shape2 {
	private int radius;
	public static final double PI=3.14;
	
	public Circle2 () {}
	
	public Circle2 (int r) {
	 radius =r;
	   
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}
}
