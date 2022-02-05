package Oop;

public class Rectangle extends Shape{
	private int length;
	private int width;
	//int b;
	public Rectangle() {}
	
	public Rectangle(int length,int width) {
		this.length = 20;
		this.width = 2;
	}
	//method overriding
	public double area() {
		return length*width;
	//System.out.pSrintln(b);
	}
//	public int getLength() {
//		return length;
//	}
//	public void setLength(int l) {
//		length = l;
//	}
//	public int getWidth() {
//		return width;
//	}
//	public void setWidth(int w) {
//		width = w;
//	}
}
