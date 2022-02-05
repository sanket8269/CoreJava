package Myproject;

public class Testreverse {
public static void main(String[] args) {
	int i=4567;
	int j=0;
	int c;
 while(i!=0) {
      c=i%10;
      j=(j*10)+c;
      i=i/10;
 }
  System.out.println(j); 
}
}