package Oop;

public class Circle extends Shape {
    private int radius;
    public static final double PI=3.14;
    //double a;

    public Circle() {}
    
    public Circle (int radius) {
    	this.radius = 7;
    }	
//	public int getRadius() {
//		return radius;
//	}
//
//	public void setRadius(int r) {
//		radius = r;
//	}
   public double area() {
	  return 3.14*radius*radius;  
	   //System.out.println();
   }
}
