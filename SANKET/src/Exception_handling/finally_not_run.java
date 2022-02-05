package Exception_handling;

public class finally_not_run {
	public static void main(String[] args) {
		try {
		String s = "Antim";
		System.out.println(s.length());
		System.out.println(s.charAt(6));
	}catch(Exception e) {
		System.out.println(e.getMessage());
	System.exit(1);
	}
	finally {
	System.out.println("i am finally");
}}}