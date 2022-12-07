package in.co.rays.OOP;

public class TestPersonInheri {
  
	  public static void main (String []args) {
		  
		  Businessman b = new Businessman ();
		  Doctor d = new Doctor ();
		  Student s = new Student ();
		  
		  b.setaddress("Indore");
		  System.out.println("BusinessMan address is "+ b.getaddress());
		  
		  b.setIncome(50000);
		  System.out.println("Businessman Income is "+ b.getIncome());
		  
		  d.setRajistrationNo("101");
		  System.out.println("Doctor rajistartion no. is "+ d.getRajistrationNo());
		  
		  d.setname("Shajid");
		  System.out.println("Doctor Name is "+ d.getname());
		  
		  s.setRollNo("012345");
		  System.out.println("Student Rollnumber is "+ s.getRollNo());
		  
		  s.setmarks(99);
		  System.out.println("Student Marks is "+ s.getmarks());
		  
		  
	  }
	  
}
