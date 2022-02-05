package Coustum_Data_Type;

public class Testpolymorphism_usingarray {
	public static void main(String[] args) {
		Shape s[] = new Shape[3];
		s[0]= new Circle(11);
        s[0].setColor("black");
		s[0].setBorderWidth(23);
		
         System.out.println(s[0].area());
         System.out.println(s[0].getColor());
         System.out.println(s[0].getBorderWidth());

		s[1]= new Rectangle(17,35);		
		s[1].setBorderWidth(34);
		s[1].setColor("orange");
		
		System.out.println(s[1].area());
		System.out.println(s[1].getBorderWidth());
		System.out.println(s[1].getColor());
	
		s[2]= new Triangle(15,7);
		s[2].setBorderWidth(89); 	 
		s[2].setColor("blue");
		
		System.out.println(s[2].area());
		System.out.println(s[2].getBorderWidth());
		System.out.println(s[2].getColor());
	}

}
