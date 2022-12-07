package in.co.rays.OOP;

public class TestEncapsulationEx {
	
	public static void main (String [] args) {
		
		EncapsulationEx en = new EncapsulationEx ();
		
		en.setFname ("Ram");
		en.setLname ("XYZ");
		en.SetId (1);
		
		String fname = en.getFname ();
		System.out.println (fname);
		
		String lname = en.getLname ();
		System.out.println (lname);
		
		int id =en.getId ();
		System.out.println(id);
	}

}
