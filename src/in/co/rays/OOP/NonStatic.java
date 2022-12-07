package in.co.rays.OOP;

public class NonStatic {
	public static void main (String []args) {
		int m=2;
		int n=3;
		
		NonStatic obj =new NonStatic();
		int value = obj.sum (n,m);
		
		System.out.println(value);
	}
	
	public int sum (int a , int b) {
		return a+b;
	}
}
