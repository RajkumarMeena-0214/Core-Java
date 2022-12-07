package in.co.raysBasics;

public class AndOr {
	public static void main (String [] args) {
		
		int a = 10;
		int b = 20;
		
		if (a > 0 && b > 0) {
			System.out.println("Logical And...!");
		}else {
			System.out.println("Defalt Block...!");
		}

       int c = 20;
       int d = 5;
       
       if (c > 0 || d > 0) {
    	   System.out.println("Logical Or...!");
       }else {
    	   System.out.println("Defalt Block");
       }

}
}