package in.co.rays.OOP;

public class StaticMethod {
	public static void main (String []args) {
		int n=2;
		int m=3;
		int o= 4;
		
		int value = StaticMethod.subs(m, o);
		System.out.println(value); 
	} 
	public static int subs (int a,int b){
		
		return a-b;
	}

}
