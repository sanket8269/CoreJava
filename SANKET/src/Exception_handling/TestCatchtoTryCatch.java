package Exception_handling;

public class TestCatchtoTryCatch {
	public static void main(String[] args) {
		try{
			
		}finally {
			System.out.println("i am finally");
			try{	
			String s = "jain";
			System.out.println(s.charAt(5));
			System.out.println(s.length());
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}}}	}

