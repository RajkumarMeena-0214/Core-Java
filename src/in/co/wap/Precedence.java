package in.co.wap;

public class Precedence {
	
	public static void main (StringEx[] args ) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int total = a+b-c*d;
		int value = a*b-c+d;
		 
		System.out.println("Total is = " + total+".");
		System.out.println("Value is = " + value+".");
		
		float aa = 1.1f;
		float bb = 2.2f;
		float cc = 3.3f;
		float total2 = aa/bb*cc;
		float value2 = aa*bb/cc;
		
		
	    System.out.println("Total 2 is = " + total2+".");
		System.out.println("Value 2 is = " + value2+".");
		
		double x = 15;
		double y = 20;
		double z = 25;
		
		double total3 = x+y*z;
		double value3 = x+y-z*x;
		
		System.out.println("Total 3 is = "+ total3+".");
		System.out.println("Value 3 is = "+ value3+".");
		
		
		
		
	}
	

}
