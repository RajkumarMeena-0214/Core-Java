package in.co.wap;

import java.util.Scanner;

public class CalculatorPractice {
	public static void main (StringEx []args) {
		int n;
		int m;
		int  ch ;
		System.out.println("enter any number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		Scanner s=new Scanner(System.in);
		m=s.nextInt();
		 
		Scanner a=new Scanner(System.in);
		ch=a.nextInt();
		 switch (ch) {
		case 1:
			 int add = n+m;
			 System.out.println("your addition is "+ add);

			break;
			
		case 2:
			 int sub = n-m;
			 System.out.println("your subtraction is is "+ sub);

			break;	

		default:
			
			System.out.println("plz enter write choice");
			break;
	  }
		
    }
}
