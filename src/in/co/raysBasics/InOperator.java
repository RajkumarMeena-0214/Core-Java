package in.co.raysBasics;

public class InOperator {
	public static void main (String [] args) {
		int a = 10;
		System.out.println("Pre-Increment Values is ~");
		System.out.println (a); // 10
		
		int b=++a; // Pre-Increment 
		System.out.println (a); //11
		System.out.println (b); //11
		
		int c = 10;
		System.out.println("Post Increment Values is ~");
		System.out.println(c); //10
		
		int d=c++; // Post-Increment
		System.out.println (c); //11
		System.out.println (d); //10
		
		int x = 10;
		System.out.println("Pre Decrement Values is ~");
		System.out.println(x); //10
		
		int y=--x; // Pre-Decrement
		System.out.println(x); //9
		System.out.println(y); //9
		
		int x1 = 10;
		System.out.println("Post-Decrement Valus is");
		System.out.println(x1); //10
		
		int y1 = x1--; // Post-Decrement
		System.out.println(x1); //9
		System.out.println(y1); //10
		
		
		
	}

}
