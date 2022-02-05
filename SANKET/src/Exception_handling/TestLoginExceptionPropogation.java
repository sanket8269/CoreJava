package Exception_handling;

public class TestLoginExceptionPropogation extends Exception{
	public static void main(String[] args) {
			try {
				login("Sanket");
			} catch (LoginException e) {
				System.out.println(e.getMessage());
			}
			}
	
	public static void login(String name) throws LoginException {
	if(!name.equals("admin")) {
		LoginException e = new LoginException();
			throw e;
	
}}
}
