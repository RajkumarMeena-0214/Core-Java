package in.co.ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		 int i = 0;
		 int j = 15;
		 
		 try {
			 int value = j/i;
			 System.out.println(value);
		 }
		 catch (Exception e) {
			// TODO : handle exception
			// System.out.println("Divided by Zero");
			 e.printStackTrace();
			// System.out.println(e.getMessage());
		 }
		 finally
		     {
			 System.out.println("Finally Block");
		     }

	}

}
