package in.co.rays.OOP;

public class ConsA {

	private String Fname;
	private String Lname;
	private int id;

	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public int getid() {
		return id;
	}
	// Parametrized Constractor

	public ConsA(String Fname, String Lname, int id) {

		this.Fname = Fname;
		this.Lname = Lname;
		this.id = id;
	}
	// Default Constractor

	public ConsA() {
		super();
		System.out.println("This is Default Constractor");
	}

}
