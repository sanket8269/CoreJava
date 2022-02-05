package Exception_handling;

public class LoginException extends Exception{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 4242632642361514733L;

	public LoginException() {
		 super("user not found");
	 }

}
