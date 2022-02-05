package Exception_handling;

public class TestRuntimeException {
public static void main(String[] args) {
	try {
	String s = "vijay";
	        System.out.println(s.length());
			System.out.println(s.charAt(6));
//	}catch(RuntimeException e) {
//		e.getMessage(); 	
	}catch(Exception e) {	
		
		System.out.println(e.getMessage());
	}
	
	
}
}
