package Coustum_Data_Type;

public class Shape { 
	private String color;
	private int borderWidth;
	public static final double PI = 3.14;
	
	public static double getPi() {
		return PI;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public Shape getShape() {
		return null;
	}
	public double area() {
		return 0.0;
	}
	}
