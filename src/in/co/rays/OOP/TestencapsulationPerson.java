package in.co.rays.OOP;

public class TestencapsulationPerson {
	
	public static void main (String [] args) {
		
		EncapsulationPerson en = new EncapsulationPerson ();
		
		en.setName ("Rajkumar");
		en.setDob  ("10/06/97");
		en.setAddress("Sehore");
		en.setAge (24);
		
		String name = en.getName ();
		System.out.println(name);
		
		String dob = en.getDob ();
		System.out.println(dob);
		
		String  address = en.getAddress ();
		System.out.println(address);
		
		int age = en.getAge ();
		System.out.println(age);
		
	}
}
