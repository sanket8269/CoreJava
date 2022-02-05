package Coustum_Data_Type;

public class TestMethode_overriding {
	public static void main(String[] args) {
		Shape s = new Circle(4);
		double f =s.area();
		System.out.println(f);
		
		Shape t = new Rectangle(7,8);
		double g = t.area();
		System.out.println(g);
		
		Shape o = new Triangle(9,8);
		double y = o.area();
		System.out.println(y);
	
	
	
		
	}

}
