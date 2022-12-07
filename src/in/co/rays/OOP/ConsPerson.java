package in.co.rays.OOP;

public class ConsPerson {
	
	private String name;
	private String dob;
	private String address;
	private int age;
	
	public String getname () {
		return name;
	}
	public String getdob () {
		return dob;
	}
    public String getaddress () {
    	return address;
    }	
    public int getage () {
    	return age;
    }
   public ConsPerson (String name, String dob, String address, int age) {
	   
	 this.name = name;
	 this.dob = dob;
	 this.address = address;
	 this.age = age;
   }
	 public ConsPerson () {
     super ();
     System.out.println("This is Default Constractor");
   }
}
