package in.co.rays.OOP;

public class NonStatic2 {
	public static void main (String []args) {
		int m=2;
		int n=3;
		
		NonStatic2 obj =new NonStatic2();
		int value = obj.sum (n,m);
		
		System.out.println(value);
	}
	
	public int sum (int a , int b) {
		return a+b;
	}
}
