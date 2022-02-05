package Coustum_Data_Type;

public class TestPolymorphism_for_Method_Argument {
	public static void main(String[] args) {
		Shape []s = new Shape[3];
		s[0]=new Circle(2);
		s[1] = new Rectangle(2,2);
		s[2] = new Triangle(3,3);
		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}
      public static double calcArea(Shape[]s) {
    	  double totalArea =0;
    	  
    	  for(int i = 0;i<s.length;i++) {
    		  totalArea+= s[i].area();
    }
    	  return totalArea;
      }
     }
