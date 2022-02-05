package Oop;

public class TestCircle {
public static void main(String[] args) {
	Shape s= new Circle(2);
    double d= s.area();
    System.out.println(d);
 		
    Shape n = new Rectangle(3,7);
    double f = n.area();
    System.out.println(f);   
   
    Shape z = new Triangle(67,9);
    double v = z.area();
    System.out.println(v);
    
}
}
