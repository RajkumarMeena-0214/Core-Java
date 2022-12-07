package in.co.rays.OOP;

public class TestConsPerson {
	
	public static void main (String []args) {
		
		ConsPerson r1 = new ConsPerson ("Rajkumar","10/06/97","Sehore", 24);
		 
		String n = r1.getname ();
		System.out.println(n);
		
		String dob = r1.getdob ();
		System.out.println(dob);
		
		String add = r1.getaddress ();
		System.out.println(add);
		
		int age = r1.getage ();
		System.out.println(age);
	}

}
