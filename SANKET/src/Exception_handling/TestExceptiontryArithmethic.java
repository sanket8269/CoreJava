package Exception_handling;

public class TestExceptiontryArithmethic {
	public static void main(String[] args) {		
		int i = 0;
		int e = 15;
		try {
		double div = e / i;	
		System.out.println(div);
	} catch (ArithmeticException f) {
		System.out.println(f.getMessage());
		
	}
		
	
	
	}}
