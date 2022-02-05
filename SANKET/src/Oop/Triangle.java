package Oop;

public class Triangle extends Shape {
	private int base;
	private int hight;
	//int s;
	
	public Triangle() {}
	
	public Triangle (int base,int hight) {
		this.base = 8;
		this.hight = 9;
	}
	//method overriding
	public double area() {
		return base*hight/2;
		//System.out.println(s);
	}
/*
	public int getBase() {
		return base;
	}

	public void setBase(int BS) {
		base = BS;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hi) {
		hight = hi;
	}
 */
}
