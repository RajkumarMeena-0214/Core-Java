package in.co.ExceptionHandling;

public class TestLoginException {

	public static void main(String[] args) throws LoginException {
		
		TestLoginException t = new TestLoginException();
		
		try {
			  t.authenticate ("aade");
			  System.out.println("No Exception found");
		}
//		catch (LoginException e) {
//			
//			System.out.println("User acces Dinide");
//		}
		finally {
			
			System.out.println("This is finally block");
		}
	}

        public void authenticate (String name) throws LoginException {
        	
        	if (!"Roll".equals (name)) {
        		
        		LoginException e = new LoginException ();
        		throw e;
        	}
        }
}
