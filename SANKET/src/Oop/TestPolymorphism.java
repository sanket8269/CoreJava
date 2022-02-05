package Oop;

public class TestPolymorphism {
	public static void main(String[] args) {
		Shape[] s = new Shape[3];
		s[0] = new Rectangle(20,2);
		s[1] = new Triangle(8,9);
		s[2] = new Circle(2);
		double totalArea= calcArea(s);
		System.out.println(totalArea);
	}
	public static double calcArea(Shape[]s) {
		double totalArea = 0;
		
		for(int k=0;k<s.length;k++){
			totalArea +=s[k].area();
		}
		return totalArea;
	}
}

