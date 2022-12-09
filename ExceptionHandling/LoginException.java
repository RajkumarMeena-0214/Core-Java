package in.co.ExceptionHandling;

public class LoginException extends Exception {

      public LoginException () {
    	  
    	  super ("Invalid User, pls fill correct credentials");
      }
}
