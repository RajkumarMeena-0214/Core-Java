package in.co.raysBasics;

public class TypeCasting {
	public static void main (String [] args) {
    // small to big data type convertion
	//Implicit type casting
		int i = 5;
		System.out.println("Implicit (widening) Values is ~");
		System.out.println(i);
		double d = i;
		System.out.println(d);
		
		//big to small data type convertion
		//Explicit type casting
		double D = 5;
		System.out.println("Explicit (narowing) Values is ~");
		System.out.println(D);
		int I = (int) D;
		System.out.println(I);
		
	}

} 
