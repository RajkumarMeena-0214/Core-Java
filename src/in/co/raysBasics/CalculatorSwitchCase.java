package in.co.raysBasics;

public class CalculatorSwitchCase {
	public static void main (String []args) {
		String s = "a*b";
		int a =20;
		int b =30;
		
		switch (s) {
		case "a+b":
		System.out.println(a+b);
		break;
		case "a-b":
		System.out.println(a-b);
		break;
		case "a*b":
		System.out.println(a*b);
		break;
		case "a/b":
		System.out.println(a/b);
		break;
		default:
		System.out.println("Default Number");
		break;
		}
	}
}

