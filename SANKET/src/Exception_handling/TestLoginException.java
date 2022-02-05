package Exception_handling;

public class TestLoginException {
	public	 static void main(String[] args) {	
	LoginException e = new LoginException();
		try {
			throw e;//raised
		} catch (LoginException e1) {
		System.out.println(e1.getMessage());
		}
	
	
	
	}

}
