package Myproject;

public class Teststringbuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Mohhamad");
	System.out.println(sb.reverse());
    System.out.println(sb.capacity());
    System.out.println(sb.charAt(5));
    System.out.println(sb.length());
    System.out.println(sb.substring(4));
    System.out.println(sb.append(sb));
    System.out.println(sb.subSequence(4, 7));


}
}
