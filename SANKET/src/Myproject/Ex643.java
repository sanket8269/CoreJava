package Myproject;

public class Ex643 {
public static void main(String[] args) {
 String s = "Mohhamad";
 System.out.println(s.length());
 char c = 'a';
 int Count = 0;
for(int i=0;i<s.length();i++){
 if (c==s.charAt(i)) {
	 Count++;
 }
}	
	System.out.println(Count);
}
}