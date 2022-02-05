package Oop;

public class TestShape {
public static void main(String[] args) {
	ShapeS1 s = new ShapeS1();
	new ShapeS1("BLACK",5);
    new ShapeS1(6,"red");
	
	s.setcolor("black");
	s.setborderWidth(10);
	System.out.println("color" + s.getcolor());
	System.out.println("borderWidth" + s.getborderWidth());
	System.out.println(ShapeS1.PI);
}
}
