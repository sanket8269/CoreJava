
public class Testbuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("vijay");
	sb.append("Dinanath Chouhan");
	System.out.println(sb.length());
    System.out.println(sb.capacity());
    System.out.println(sb.charAt(9));
    System.out.println(sb.indexOf("vija"));
    System.out.println(sb.replace(1, 5,"jay"));
    System.out.println(sb.reverse());
}
}
