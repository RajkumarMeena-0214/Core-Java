package in.co.rays.OOP;

public class TestConsA {
	
	public static void main (String []args) {
		
		ConsA r1 = new ConsA ("Rajkumar", "Meena", 1);
		
		String fn = r1.getFname();
		System.out.println(fn);
		
		String ln = r1.getLname();
		System.out.println(ln);
		
		int id = r1.getid();
		System.out.println(id);
	}

}
