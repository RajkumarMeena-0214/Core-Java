package in.co.rays.OOP;

public class MethodOverloading {
	
	public static void main (String [] args) {
		
		display (1);
		display (1,4);
		display ("hey", "Hello","Hii");
	}
	   public static void display (int i, int j) {
		   System.out.println("Arguments : " + i + " & "+ j );
	   }
	   public static void display (int s) {
		   System.out.println("arguments : " + s);
	   }
	   public static void display (String s, String t, String u ) {
		   System.out.println("Arguments : "+s +","+ t +","+u);
	   }

}
  