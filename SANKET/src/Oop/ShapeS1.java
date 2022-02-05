package Oop;

public class ShapeS1 {
 private String color;
 private int borderWidth;
 public static final double PI=3.14;
 
 public ShapeS1() {
	 System.out.println("i am Constructer");
 }
 public ShapeS1(int b ,String w) {
	 borderWidth=b;
	 color=w;
	 System.out.println(b+""+w);
 }	
 public ShapeS1(String w, int b) {
	 color=w; 
	 borderWidth=b; 
    System.out.println(w+""+b);
 }
 public static double getPi() {
	return PI;
}
public void setcolor(String c) {
	   color = c;
 }
  public String getcolor() {
  return color;
}
  public void setborderWidth(int b) {
	  borderWidth = b;
  }
  public int getborderWidth() {
	  return borderWidth;
  }
}