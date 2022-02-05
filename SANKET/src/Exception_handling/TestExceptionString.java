package Exception_handling;

public class TestExceptionString {
	
	public static void main(String[] args) {
		try {
//		String s = null;
			String s = "java";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
	 }catch (StringIndexOutOfBoundsException | ArithmeticException  e) {
			System.out.println("String me length nahi hai");
//		}catch (StringIndexOutOfBoundsException e) {
//			System.out.println("String me chartcter nahi hai");
	}finally {
			System.out.println("java hu me");
		}
		
		
		
	}

}
	